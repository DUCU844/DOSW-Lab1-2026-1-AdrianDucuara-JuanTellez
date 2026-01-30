package reto2;

import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class CarreraParalela {

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

    public static Resultados procesarDosListas(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
        Resultados resultados = new Resultados();
        resultados.listaUno = procesarUnaLista(lista1);
        resultados.listaDos = procesarUnaLista(lista2);
        return resultados;
    }

    private static Resultado procesarUnaLista(ArrayList<Integer> numeros) {
        Resultado r = new Resultado();

        r.maximo = calcularNumeroMaximo(numeros);
        r.minimo = calcularNumeroMinimo(numeros);
        r.cantidad = numeros.size();

        r.maxEsMultiploDe2 = (r.maximo % 2 == 0);
        r.maxEsDivisorDe2 = (r.maximo != 0 && 2 % r.maximo == 0);
        r.cantidadEsPar = (r.cantidad % 2 == 0);

        return r;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> lista1= new ArrayList<>();
        ArrayList<Integer> lista2= new ArrayList<>();

        System.out.println("Inicio de la Carrera en Paralelo");
        System.out.println("Cuantos numeros lista 1: ");
        int n1 = input.nextInt();
        for (int i = 0; i < n1; i++) lista1.add(input.nextInt());

        System.out.println("Cantidad de numeros lista 2:");
        int n2 = input.nextInt();
        for (int i = 0; i < n2; i++) lista2.add(input.nextInt());

        Resultados r = procesarDosListas(lista1, lista2);

        System.out.println("Lista 1 -> Max: " + r.listaUno.maximo +
                ", Min: " + r.listaUno.minimo +
                ", Cantidad: " + r.listaUno.cantidad +
                ", Multiplo 2: " + r.listaUno.maxEsMultiploDe2 +
                ", Divisor 2: " + r.listaUno.maxEsDivisorDe2 +
                ", Cantidad par: " + r.listaUno.cantidadEsPar);

        System.out.println("Lista 2 -> Max: " + r.listaDos.maximo +
                ", Min: " + r.listaDos.minimo +
                ", Cantidad: " + r.listaDos.cantidad +
                ", Multiplo 2: " + r.listaDos.maxEsMultiploDe2 +
                ", Divisor 2: " + r.listaDos.maxEsDivisorDe2 +
                ", Cantidad par: " + r.listaDos.cantidadEsPar);
    }
}