package reto2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Scanner;
import java.util.ArrayList;

public class CarreraParalela {
    private static ArrayList<Integer> numeros= new ArrayList<>();
    private int numeroMax;

    public int calcularNumeroMaximo (ArrayList<Integer> numeros){
        return numeros.stream()
                .max(Integer::compare)
                .get();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inicio de la Carrera en Paralelo");
        System.out.println("Cuantos numeros deseas ingresar: ");
        int cantidadNumeros = input.nextInt();

        for (int i = 0; i<cantidadNumeros; i++ ){
            System.out.println("Ingrese el numero: ");
            numeros.add(input.nextInt());
        }

    }

}