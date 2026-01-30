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

        System.out.println("HashSet: " + inicial);

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

        System.out.println("TreeSet: " + inicial);

        Set<Integer> sinMultiplosDe5 = inicial.stream()
                .filter(n -> n % 5 != 0)
                .collect(TreeSet::new, TreeSet::add, TreeSet::addAll);

        return sinMultiplosDe5;
    }

    public static Set<Integer> choque(Set<Integer> hashSet, Set<Integer>treeSet) {
        Set<Integer> union = new TreeSet<>();
        union.addAll(hashSet);
        union.addAll(treeSet);

        System.out.println("Union: " + union);

        return union;
    }

    public static void main(String[] args) {
        Set<Integer> guerrerosA = procesarHashSet(5, 10);
        Set<Integer> guerrerosB = procesarTreeSet(5, 10);

        Set<Integer> arena = choque(guerrerosA, guerrerosB);

        arena.stream()
                .forEach(n -> System.out.println("numero en arena: " + n));
    }
}
