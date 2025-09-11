public class Util {
    public static <T> void ordenar(T[] arr, Criterio<T> cr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (cr.comparar(arr[j], arr[j + 1]) > 0) {
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
