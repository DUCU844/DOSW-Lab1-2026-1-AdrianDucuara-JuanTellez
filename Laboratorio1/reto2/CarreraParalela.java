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

    }

}