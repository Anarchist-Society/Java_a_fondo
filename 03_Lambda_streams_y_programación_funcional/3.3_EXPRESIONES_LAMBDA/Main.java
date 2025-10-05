// 3.3. EXPRESIONES LAMBDA
// Las expresines lambda podemos utilizarlas para implementar interfaces funcionales sin necesidad de escribir una clase para tal fin.
// Vamos a implementar Comparator con distintas expresiones lambda que nos permiten establecer diferentes criterio de precedencia para ordenar una colección de números enteros.

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista con los números de 1 a 10 desordenador
        // List<Integer> list = Arrays.asList(5, 2, 4, 3, 7, 9, 6, 1, 10, 8);

        // Comparator<Integer> c1 = (a, b) -> a - b; // De menor a mayor
        // Collections.sort(list, c1);
        // System.out.println(list);

        // System.out.println();

        // Comparator<Integer> c2 = (a, b) -> b - a; // De mayor a menor
        // Collections.sort(list, c2);
        // System.out.println(list);

        // Las variables c1 y c2 no son necesarias, pues la misma expresión lambda puede pasar como argumento de un método.
        List<Integer> list = Arrays.asList(5, 2, 4, 3, 7, 9, 6, 1, 10, 8);

        // Ordenamos de menor a mayor
        Collections.sort(list, (a, b) -> a - b);
        System.out.println(list);

        System.out.println();

        Collections.sort(list, (a, b) -> b - a);
        System.out.println(list);
        
        System.out.println();

        // No es obligatorio declarar una variable para contener una expresión lambda, pero en ocasiones puede contribuir a mejorar la legibilidad del código.
        List<String> lst = Arrays.asList("Pablo"
                                        ,"Juan"
                                        ,"Octaviano"
                                        ,"Alberto"
                                        ,"Romulo");

        // De menor a mayor según la cantidad de caracteres
        Comparator<String> c = (a, b) -> {
            int lenA = a.length();
            int lenB = b.length();
            return lenA - lenB;
        };
        Collections.sort(lst, c);
        System.out.println(lst);
    }
}
