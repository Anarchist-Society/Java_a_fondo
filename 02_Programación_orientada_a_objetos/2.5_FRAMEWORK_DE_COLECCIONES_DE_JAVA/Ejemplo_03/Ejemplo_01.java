import java.util.Arrays;
import java.util.List;

public class Ejemplo_01 {
    public static void main(String[] args) {
        // 2.5.5.1. Convertir arrays en List y viceversa
        // En este ejemplo convertimos un array primitivo en una instancia de List
        // as.List sería como un factory method
        Integer[] arr1 = {1,2,3,4};
        List<Integer> list1 = Arrays.asList(arr1);
        System.out.println(list1);

        // También podemos obtener una lista a partir de un conjunto de elementos
        List<Integer> list2 = Arrays.asList(1,2,3,4);
        System.out.println(list2);
        System.out.println();

        // El caso invertido será convertir una instancia de List en un array primitivo
        List<Integer> list = Arrays.asList(1,2,3,4);
        Integer[] arr2 = (Integer[])list.toArray();
    }
}
