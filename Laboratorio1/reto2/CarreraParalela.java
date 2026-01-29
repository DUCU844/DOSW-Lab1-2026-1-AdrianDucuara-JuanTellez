package reto2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.ArrayList;

public class CarreraParalela {
    private static ArrayList<Integer> numeros= new ArrayList<>();


    public static int calcularNumeroMaximo (ArrayList<Integer> numeros){
        return numeros.stream()
                .max(Integer::compare)
                .get();
    }
    public static int calcularNumeroMinimo(ArrayList<Integer> numeros ){
        return numeros.stream()
                .min(Integer::compare)
                .get();
    }

    public static void compararResultados (ArrayList<Integer> numeros){
        int maximo = calcularNumeroMaximo(numeros);

        String resultadoVueltaDosCarrilUno = (maximo % 2 == 0) ?
                "El numero mayor es multiplo de dos" :
                "El numero mayor no es multiplo de dos";
        System.out.println(resultadoVueltaDosCarrilUno);

        String resultadoVueltaDosCarrilDos = (maximo == 0) ? "division por 0 no esta definida" : ((2 % maximo == 0) ?
                "El numero mayor es divisor de dos" :
                "El numero mayor no es divisor de dos");
        System.out.println(resultadoVueltaDosCarrilDos);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de la Carrera en Paralelo");
        System.out.printf("Cuantos numeros deseas ingresar: ");
        int cantidadNumeros = input.nextInt();

        for (int i = 0; i<cantidadNumeros; i++ ){
            System.out.printf("Ingrese el numero: ");
            numeros.add(input.nextInt());
        }

        long totalDatos = numeros.stream().count();

        System.out.println("El numero minimo es: " + calcularNumeroMinimo(numeros));
        System.out.println("Cantidad de datos ingresados: " + totalDatos);

        compararResultados(numeros);


        String datosPar = (cantidadNumeros % 2 == 0)?
                "La cantidad de datos es par" :
                "La cantidad de dator es impar";

        System.out.println(datosPar);
    }

}