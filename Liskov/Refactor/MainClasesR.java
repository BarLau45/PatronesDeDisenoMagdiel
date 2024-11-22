package Liskov.Refactor;

public class MainClasesR {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Alexis", 10);
        Persona maestro = new Maestro("Magdielito.com", "Matemáticas discretas");

        maestro.mostrarInfo();
        alumno.mostrarInfo();

        alumno.realizarExamen();
    }
}
