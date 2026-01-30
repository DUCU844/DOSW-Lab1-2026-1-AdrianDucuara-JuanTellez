package reto6;

import reto3.Reto3;

import java.util.HashMap;
import java.util.Map;


public class Reto6 {
    static Map<String, Runnable> comandos = new HashMap<>();

    public static void ejecutarComando(String comando) {

        switch (comando) {
            case "BROMEAR":
                System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio…");
                break;
            case "GRITAR":
                System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!");
                break;
            case "SUSURRAR":
                System.out.println("La máquina susurra: Shhh… los bugs están dormidos");
                break;
            case "ANALIZAR":
                System.out.println("La máquina procesa: Analizando datos… resultado: ¡Eres increíble programando!");
                break;
            default:
                System.out.println("Comando no reconocido");
        }
    }

    public static void main(String[] args) {

    }
}