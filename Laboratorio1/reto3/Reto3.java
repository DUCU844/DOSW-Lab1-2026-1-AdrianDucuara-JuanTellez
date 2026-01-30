package reto3;

public class Reto3{
    private static StringBuilder sb;
    private static StringBuffer sbf;

    public static StringBuilder MensajeRepetido(String mensaje){
        sb = new StringBuilder(mensaje);
        for(int i = 0; i < 2; i++) {
            sb.append(" " + mensaje);
        }
        return sb;
    }

    public static StringBuffer MensajeInvertido(String mensaje){
        sbf = new StringBuffer(mensaje);
        return sbf.reverse();
    }

    public static void main(String[] args) {
        StringBuilder mensajeRepetido = MensajeRepetido("Hola");
        System.out.println(mensajeRepetido);

    }
}