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

    public static void main(String[] args) {
        StringBuilder mensajeRepetido = MensajeRepetido("Hola");
        System.out.println(mensajeRepetido);

    }
}