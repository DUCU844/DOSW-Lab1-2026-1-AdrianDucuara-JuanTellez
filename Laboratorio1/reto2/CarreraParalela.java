package reto2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.ArrayList;

public class CarreraParalela {
    private static ArrayList<Integer> numeros= new ArrayList<>();


    public int calcularNumeroMaximo (ArrayList<Integer> numeros){
        return numeros.stream()
                .max(Integer::compare)
                .get();
    }

    public static void combinacionResultados(ArrayList<Integer> numeros){

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
        int numeroMin = numeros.stream().min(Integer::compare).get();
        System.out.println("El numero minimo es: " + numeroMin);
        System.out.println("Cantidad de datos ingresados: " + totalDatos);
    }

}