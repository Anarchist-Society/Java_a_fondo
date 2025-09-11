public class CriterioAlumNotaProm implements Criterio<Alumno> {
    public int comparar(Alumno a, Alumno b) {
        double diff = a.getNotaPromedio() - b.getNotaPromedio();
        // Primero preguntamos si diff es mayor que 0; en tal caso retornamos 1
        // Si no se verifica la condición anterior, preguntamos si diff es menor que 0; de ser así retornamos -1
        // Y si no se verifican ambas condiciones retornamos 0
        return diff > 0 ? 1 : diff < 0 ? -1 : 0;
    }
}
