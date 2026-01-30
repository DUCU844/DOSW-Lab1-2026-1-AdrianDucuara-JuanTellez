package reto3;

public class Reto3{
    private static StringBuilder sb;

    public static StringBuilder MensajeRepetido(String mensaje){
        sb = new StringBuilder(mensaje);
        for(int i = 0; i < 2; i++) {
            sb.append(" " + mensaje);
        }
        return sb;
    }

    public static StringBuffer transformarMensaje(String mensaje) {

        String repetido = java.util.stream.IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .reduce((a, b) -> a + " " + b)
                .orElse("");

        StringBuffer sbf = new StringBuffer(repetido);
        return sbf.reverse();
    }

    public static void main(String[] args) {
        StringBuilder mensajeRepetido = MensajeRepetido("Hola");
        System.out.println(mensajeRepetido);

    }
}