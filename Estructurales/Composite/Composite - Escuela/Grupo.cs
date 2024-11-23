public class Grupo : IPromedio {
    private string nombre;
    private List<Alumno> alumnos = new List<Alumno>();

    public Grupo(string nombre) {
        this.nombre = nombre;
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.Add(alumno);
    }

    public string getNombre() {
        return nombre;
    }

    public double getPromedio() {
        double promedio = 0;
        foreach (Alumno alumno in alumnos)
        {
            promedio += alumno.getPromedio();
        }
        promedio = promedio/alumnos.Count();
        return promedio;
    }
}