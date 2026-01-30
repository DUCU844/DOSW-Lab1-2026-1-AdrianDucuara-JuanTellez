package reto5;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;


public class Reto5{

    public static Set<Integer> procesarHashSet(int cantidad, int rango){
        Set<Integer> inicial = new HashSet<>();
        Random random = new Random();

        while (inicial.size() < cantidad){
            inicial.add(random.nextInt(rango) + 1);
        }

        Set<Integer> sinMultiplosDe3 = inicial.stream()
                .filter(n -> n % 3 != 0)
                .collect(HashSet::new, HashSet::add, HashSet::addAll);

        return sinMultiplosDe3;
    }

    public static void main(String[] args) {

    }
}