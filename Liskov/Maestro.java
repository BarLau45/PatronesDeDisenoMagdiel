package Liskov;

public class Maestro extends Persona {
    private String materia;

    public Maestro(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Materia: " + materia);
    }

    @Override
    public void realizarExamen() {
        throw new UnsupportedOperationException("Los maestros no realizan exámenes");
    }
}
