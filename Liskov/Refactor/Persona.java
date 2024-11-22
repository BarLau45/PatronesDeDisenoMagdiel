package Liskov.Refactor;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
    }
}
