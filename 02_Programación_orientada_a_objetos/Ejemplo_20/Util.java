// Método que ordena un array en función del tipo genérico de objeto, en nuestro caso Alumno y del tipo de criterio, en nuestro caso con expresión lambda

public class Util {
    public static <T> void ordenar(T[] arr, Comparator<T> cr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (cr.compare(arr[j], arr[j + 1]) > 0) {
                    T aux = arr[j];
                    arr[j]  = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public static <T> void imprimir(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
