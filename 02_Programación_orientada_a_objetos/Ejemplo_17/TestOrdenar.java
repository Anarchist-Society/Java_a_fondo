// Programa que ordena un Alumno[] y lo muestra por pantalla, ordenado según el criterio establecido por el método compareTo de la clase Alumno
// En este ejemplo usamos Util.ordenar para ordenar arrays de diferentes tipos de dato: Alumno, String, Integer
// Estas clases son diferentes entre sí pero tienen en común que son comparables, por lo que tienen el método compareTo

public class TestOrdenar {
    public static void main(String[] args) {
        // Ordenamos y mostramos un Alumno
        Alumno[] alumnos = { new Alumno("Juan", 20, 8.5)
                           , new Alumno("Pedro", 18, 5.3)
                           , new Alumno("Alberto", 19, 4.6)};

        // Lo mostramos desordenado
        System.out.println("Desordenado:");
        Util.muestraArray(alumnos);
        System.out.println();

        // Lo ordenamos
        Util.ordenar(alumnos); 

        // Lo mostramos ordenado
        System.out.println("Ordenado:");
        Util.muestraArray(alumnos);
        System.out.println();

        // Ordenamos y mostramos un String[]
        String[] nombres = {"Pablo", "Andres", "Marcelo"};

        System.out.println("Desordenado:");
        Util.muestraArray(nombres);
        System.out.println();

        Util.ordenar(nombres);

        System.out.println("Ordenado:");
        Util.muestraArray(nombres);
        System.out.println();

        // Declaramos y mostramos un Integer[]
        Integer[] numeros = {3,1,2};

        System.out.println("Desordenado:");
        Util.muestraArray(numeros);
        System.out.println();

        Util.ordenar(numeros);
        Util.muestraArray(numeros);
        System.out.println("Ordenado:");
    } 
}
