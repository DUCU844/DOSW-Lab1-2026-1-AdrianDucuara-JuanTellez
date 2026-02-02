package reto4;

import java.util.*;
import java.util.stream.Collectors;

public class Reto4 {

    public static Map<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> datos) {

        Map<String, Integer> mapa = new HashMap<>();

        for (Map.Entry<String, Integer> entry : datos) {
            mapa.putIfAbsent(entry.getKey(), entry.getValue());
        }

        return mapa;
    }

    public static Map<String, Integer> crearHashTable(List<Map.Entry<String, Integer>> datos) {
        Hashtable<String, Integer> mapa = new Hashtable<>();

        for (Map.Entry<String, Integer> entry : datos) {
            mapa.putIfAbsent(entry.getKey(), entry.getValue());
        }

        return mapa;

    }

    public static Map<String, Integer> combinarMapas(
            Map<String, Integer> hashMap,
            Hashtable<String, Integer> hashTable) {

        Map<String, Integer> resultado = new HashMap<>();

        resultado.putAll(hashMap);

        hashTable.forEach(resultado::put);

        return resultado;
    }

    public static void imprimirEnMayusculas(Map<String, Integer> mapa) {

        mapa.forEach((k, v) ->
                System.out.println("Clave: " + k.toUpperCase() + " | Valor: " + v)
        );
    }

    public static void main(String[] args) {

        List<Map.Entry<String, Integer>> datos = List.of(
                Map.entry("oro", 5),
                Map.entry("plata", 3),
                Map.entry("oro", 7),
                Map.entry("diamante", 10)
        );

        Map<String, Integer> hashMap = crearHashMap(datos);

        Hashtable<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("plata", 8);
        hashTable.put("rubí", 4);
        hashTable.put("oro", 12);
        hashTable.put("esmeralda", 6);

        Map<String, Integer> combinado = combinarMapas(hashMap, hashTable);

        imprimirEnMayusculas(combinado);
    }


}