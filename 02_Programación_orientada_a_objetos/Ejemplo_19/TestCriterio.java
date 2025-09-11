// Las expresiones lambda permiten implementar interfaces. La única  restricción es que la interface debe tener declarado un único método

// Ahora hemos reemplazado las instancias de CriterioAlumNombre y CriterioAlumNotaProm por estas dos expresiones lambda, con esto ambas clases CriterioAlumNombre y
// CriterioAlumNotaProm ya no serán necesarias

public class TestCriterio {
    public static void main(String[] args) {
        Alumno[] alumnos = { new Alumno("Carlos", 23, 7.3)
                           , new Alumno("Martin", 25, 4.5)
                           , new Alumno("Anastasio", 20, 9.8)};

        // Por ejemplo, la clase CriterioAlumNombre, que escribimos para implementar Criterio, podría ser reemplazada por la siguiente expresión lambda
        // 1. Asignamos una expresión lambda a la variable c1, cuyo tipo de dato es Criterio<Alumno>
        // 2. a y b son parámetros del método comparar de la interface Criterio que estamos implementando
        // Ambos son tipo Alumno, pues declaramos la variable c1 como Criterio<Alumno>
        // 3. La flecha -> señala el valor que retornará el método comparar que estamos implementando con la expresión lambda
        Criterio<Alumno> c1 = (a,b) -> a.getNombre().compareTo(b.getNombre()); // Determinamos un orden alfabético ascendente
        Util.ordenar(alumnos, c1);
        Util.imprimir(alumnos);
        System.out.println();

        // La clase CriterioAlumNotaProm podrá reemplazarse con esta expresión:
        // 1. Asignamos la expresión lambda a c2, cuyo tipo es Criterio<Alumno>
        // 2. a y b son los parámetros del método comparar de Criterio. Como c2 es Criterio<Alumno>, a y b son tipo Alumno
        // 3. La flecha -> está seguida de un bloque de código delimitado por llaves
        // 4. El bloque de código es la implementación del método comparar
        Criterio<Alumno> c2 = (a,b) -> {
                double diff = a.getNotaPromedio() - b.getNotaPromedio();
                return diff > 0 ? 1 : diff < 0 ? -1 : 0;
        }; // Determinamos un orden ascendente por nota promedio
        Util.ordenar(alumnos, c2);
        Util.imprimir(alumnos);
    }
}
