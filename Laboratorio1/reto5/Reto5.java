package reto5;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.TreeSet;


public class Reto5 {

    public static Set<Integer> procesarHashSet(int cantidad, int rango) {
        Set<Integer> inicial = new HashSet<>();
        Random random = new Random();

        while (inicial.size() < cantidad) {
            inicial.add(random.nextInt(rango) + 1);
        }

        System.out.println("HashSet original: " + inicial);

        Set<Integer> sinMultiplosDe3 = inicial.stream()
                .filter(n -> n % 3 != 0)
                .collect(HashSet::new, HashSet::add, HashSet::addAll);

        return sinMultiplosDe3;
    }

    public static Set<Integer> procesarTreeSet(int cantidad, int rango) {
        Set<Integer> inicial = new TreeSet<>();
        Random random = new Random();

        while (inicial.size() < cantidad) {
            inicial.add(random.nextInt(rango) + 1);
        }

        System.out.println("TreeSet original (ordenado): " + inicial);

        Set<Integer> sinMultiplosDe5 = inicial.stream()
                .filter(n -> n % 5 != 0)
                .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);

        return sinMultiplosDe5;
    }

    public static void main(String[] args) {
        System.out.println("Resultado HashSet: " + procesarHashSet(10, 100));
        System.out.println("Resultado TreeSet: " + procesarTreeSet(10, 100));
    }
}