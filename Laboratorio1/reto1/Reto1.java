package reto1;

import java.util.ArrayList;
import java.util.List;

public class Reto1{

    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Juan Tellez", 21, "juan.tellez-v@mail.escuelaing.edu.co", 7));
        estudiantes.add(new Estudiante("Adrian Ducuara", 21, "cristian.ducuara-q@mail.escuelaing.edu.co", 8));

        String mensaje = MensajeBienvenida.generarMensaje(estudiantes);
        System.out.println(mensaje);
    }
}