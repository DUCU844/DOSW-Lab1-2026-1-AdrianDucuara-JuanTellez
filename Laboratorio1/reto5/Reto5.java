package reto5;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;
import java.util.TreeSet;


public class Reto5{

    public static Set<Integer> procesarHashSet(int cantidad, int rango){
        Set<Integer> inicial = new TreeSet<>();
        Random random = new Random();

        while (inicial.size() < cantidad){
            inicial.add(random.nextInt(rango) + 1);
        }

        Set<Integer> sinMultiplosDe5 = inicial.stream()
                .filter(n -> n % 5 != 0)
                .collect(HashSet::new, HashSet::add, HashSet::addAll);

        return sinMultiplosDe5;
    }

    public static void main(String[] args) {

    }
}