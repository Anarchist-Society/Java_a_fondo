public class CriterioAlumNombre implements Criterio<Alumno> {
   public int comparar(Alumno a, Alumno b) {
        return a.getNombre().compareTo(b.getNombre());
    }
}
