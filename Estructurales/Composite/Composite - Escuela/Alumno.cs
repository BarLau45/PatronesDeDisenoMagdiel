public class Alumno : IPromedio {
    private string nombre;
    private string matricula;
    private List<Materia> materias = new List<Materia>();

    public Alumno(string nombre, string matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public void agregarMateria(Materia materia, double calificacion) {
        materia.setCalificacion(calificacion);
        materias.Add(materia);
    }

    public double getPromedio() {
        double promedio = 0;
        foreach (Materia materia in materias)
        {
            promedio += materia.getCalificacion();
        }
        promedio = promedio / materias.Count();
        return promedio;
    }
}