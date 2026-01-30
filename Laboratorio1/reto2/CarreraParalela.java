package reto2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.ArrayList;

public class CarreraParalela {
    private static ArrayList<Integer> lista1= new ArrayList<>();
    private static ArrayList<Integer> lista2= new ArrayList<>();


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

    public static Resultado analizarLista(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        Resultado r = new Resultado();
        r.maximo1 = lista1.stream()
                .max(Integer::compare)
                .get();

        r.minimo1 = lista1.stream()
                .min(Integer::compare)
                .get();

        r.cantidad1 = lista1.stream().mapToInt(Integer::intValue).sum();

        r.es1MultiploDe2 = (r.max1 % 2 == 0);
        r.es1DivisorDe2 = (2 % r.max1 == 0);
        r.cantidad1Par = (r.cantidad1 % 2 == 0);

        r.maximo2 = lista1.stream()
                .max(Integer::compare)
                .get();

        r.minimo2 = lista1.stream()
                .min(Integer::compare)
                .get();

        r.cantidad2 = lista1.stream().mapToInt(Integer::intValue).sum();

        r.es2MultiploDe2 = (r.max1 % 2 == 0);
        r.es2DivisorDe2 = (2 % r.max1 == 0);
        r.cantidad2Par = (r.cantidad1 % 2 == 0);

        return r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de la Carrera en Paralelo");
        System.out.println("Cuantos numeros deseas ingresar: ");
        int cantidadNumeros = input.nextInt();

        for (int i = 0; i<cantidadNumeros; i++ ){
            System.out.println("Ingrese el numero: ");

        }








        String datosPar = (cantidadNumeros % 2 == 0)?
                "La cantidad de datos es par":
                "La cantidad de dator es impar";

        System.out.println(datosPar);

        String datosImpar = (cantidadNumeros % 2 != 0)?
                "La cantidad de dator es impar":
                "La cantidad de datos es par";

        System.out.println(datosImpar);
    }

}