package reto3;

public class Reto3{

    public static StringBuilder transformarMensaje(String mensaje) {

        String repetido = java.util.stream.IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .reduce((a, b) -> a + " " + b)
                .orElse("");

        StringBuilder sb = new StringBuilder(repetido);
        return sb.reverse();
    }

    public static void main(String[] args) {
        StringBuilder mensajeRepetido = MensajeRepetido("Hola");
        System.out.println(mensajeRepetido);

    }
}