package reto4;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reto4 {

    public static Map<String, Integer> crearHashMap(List<Map.Entry<String, Integer>> datos) {

        Map<String, Integer> mapa = new HashMap<>();

        for (Map.Entry<String, Integer> entry : datos) {
            mapa.putIfAbsent(entry.getKey(), entry.getValue());
        }

        return mapa;
    }

    public static Map<String, Integer> crearHashTable(List<Map.Entry<String, Integer>> datos) {


        Map<String, Integer> mapa = new Hashtable<>();
        
        for (Map.Entry<String, Integer> entry : datos) {
            mapa.putIfAbsent(entry.getKey(), entry.getValue());
        }

        return mapa;

    }

    public static void combinarMapas(
            Map<String, Integer> hashMap,
            Hashtable<String, Integer> hashTable) {

        Map<String, Integer> combinado =
                Stream.concat(hashMap.entrySet().stream(),
                                hashTable.entrySet().stream())
                        .collect(Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue,
                                (v1, v2) -> v2
                        ));

        System.out.println("CLAVES EN MAYÚSCULAS");
        imprimirEnMayusculas(combinado);

        System.out.println("ORDEN ASCENDENTE");
        imprimirOrdenado(
                combinado.entrySet().stream()
                        .collect(Collectors.toMap(
                                e -> e.getKey().toUpperCase(),
                                Map.Entry::getValue,
                                (v1, v2) -> v2,
                                TreeMap::new
                        ))
        );
    }

    public static void imprimirEnMayusculas(Map<String, Integer> mapa) {

        mapa.forEach((k, v) ->
                System.out.println("Clave: " + k.toUpperCase() + " | Valor: " + v)
        );
    }

    public static void imprimirOrdenado(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
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

        combinarMapas(hashMap, hashTable);
    }


}