package instituto;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Curso cursoJava = new Curso("Java Básico", 12);
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", "12345678", "A001", cursoJava);

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante1);

        //muestro la informacion de los estudintes
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrarInformacion();
        }
    }

}
