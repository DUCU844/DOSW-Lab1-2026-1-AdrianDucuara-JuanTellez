package reto6;

import java.util.HashMap;
import java.util.Map;

public class Reto6 {

    static Map<String, Runnable> comandos = new HashMap<>();

    public static void ejecutarComando(String comando) {

        switch (comando) {
            case "SALUDAR":
                System.out.println("La máquina dice: ¡Saludos, viajero del Tiempo y del código!");
                break;
            case "DESPEDIR":
                System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión.");
                break;
            case "CANTAR":
                System.out.println("La máquina canta: 01010101");
                break;
            case "DANZAR":
                System.out.println("La máquina gira y emite chispas: Girando en modo fiesta.");
                break;
            default:
                System.out.println("Comando no reconocido");
        }
    }
}
