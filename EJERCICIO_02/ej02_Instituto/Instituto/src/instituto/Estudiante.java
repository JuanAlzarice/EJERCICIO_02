
package instituto;


public class Estudiante extends Persona {
    
    String legajo;
    Curso curso;

    public Estudiante(String nombre, String apellido, String dni, String legajo, Curso curso) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
        this.curso = curso;
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + " " + apellido + ", DNI: " + dni + ", Legajo: " + legajo);
        System.out.println("Curso: " + curso.getNombre() + ", Duración: " + curso.getDuracion() + " semanas");
    }
    
}
