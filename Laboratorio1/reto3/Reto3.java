package reto3;

import java.util.stream.IntStream;

public class Reto3 {

    public static StringBuilder transformarMensaje(String mensaje) {

        String repetido = IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .reduce((a, b) -> a + " " + b)
                .orElse("");


        String invertido = new StringBuilder(mensaje).reverse().toString();

        return new StringBuilder(repetido + "\n" + invertido);
    }

    @FunctionalInterface
    interface Transformador {
        StringBuilder transformar(String mensaje);
    }

    public static void main(String[] args) {
        Transformador t = (msg) -> transformarMensaje(msg);

        StringBuilder resultado = t.transformar("Hola");
        System.out.println(resultado);
    }
}
