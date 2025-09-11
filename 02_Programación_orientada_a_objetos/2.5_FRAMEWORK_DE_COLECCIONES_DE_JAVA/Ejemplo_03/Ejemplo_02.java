import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ejemplo_02 {
    public static void main(String[] args) {
        // 2.5.5.2. Ordenar listas y arrays
        // Usamos Collections.sort para ordenar una lista
        List<Integer> list = Arrays.asList(5,3,1,4,2);

        // Ordenamos de mayor a menor
        Comparator<Integer> comparator1 = (a,b) -> a - b;
        Collections.sort(list, comparator1);
        System.out.println(list);

        // Ordenamos de menor a mayor
        Comparator<Integer> comparator2 = (a,b) -> b - a;
        Collections.sort(list, comparator2);
        System.out.println(list);
        System.out.println();

        // El método Arrays.sort permite ordenar arrays
        Integer[] arr = {2,5,1,4,3,7,6};

        // Ordenamos de menor a mayor
        Arrays.sort(arr, (a,b) -> a - b);
        System.out.println(Arrays.toString(arr));

        // Ordenamos de mayor a menor
        Arrays.sort(arr, (a,b) -> b - a);
        System.out.println(Arrays.toString(arr));
    }
}
