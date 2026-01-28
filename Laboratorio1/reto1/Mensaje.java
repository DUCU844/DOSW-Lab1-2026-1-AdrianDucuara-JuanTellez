package reto1;

import java.util.List;
import java.util.stream.Collectors;

public class MensajeBienvenida{

    public static String generarMensaje(List<Estudiante> estudiantes){

        if (estudiantes == null || estudiantes.isEmpty()) {
            return "No hay estudiantes registrados.";
        }

        String descripciones = estudiantes.stream().map(e -> e.getNombre() +
                " estudiante de la escuela de " + e.getSemestre() + "° semestre de " +
                e.getEdad() + " años ").collect(Collectors.joining("y "));

        String correos = estudiantes.stream().map(Estudiante::getCorreo).collect(Collectors.joining(" y "));

        return ("Hola, bienvenidos somos la pareja conformada por " + descripciones +
                ". Nuestros correos institucionales son ") + correos +".";
    }
}
