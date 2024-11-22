package Liskov;

public class MainClases {
    public static void realizarActividades(Persona persona) {
        persona.realizarExamen();
    }

    public static void main(String[] args) {
        Persona alumno = new Alumno("Rick", 0);
        Persona maestro = new Maestro("JVergara", "Introduccion a la programacion");

        realizarActividades(alumno);
        realizarActividades(maestro);
    }
}
