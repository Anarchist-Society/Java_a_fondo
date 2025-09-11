public class TestCriterio {
    public static void main(String[] args) {
        Alumno[] alumnos = { new Alumno("Carlos", 23, 7.3)
                           , new Alumno("Martin", 25, 4.5)
                           , new Alumno("Anastasio", 20, 9.8)};

        Util.imprimir(alumnos);
        System.out.println();
        Util.ordenar(alumnos, new CriterioAlumNombre()); // Esto se puede reemplazar por una expresión lambda
        Util.imprimir(alumnos);

        System.out.println();
        Util.ordenar(alumnos, new CriterioAlumNotaProm()); // Esto se puede reemplazar por una expresión lambda
        Util.imprimir(alumnos);
    }
}
