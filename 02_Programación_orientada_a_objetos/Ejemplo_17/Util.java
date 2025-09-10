// El método ordenar de la clase Util, permitirá ordenar un array de objetos comparables que recibe como parámetro.
// Al decir "objetos comparables" me refiero a objetos cuyas clases implementan la interface Comparable
// Para ello usará el algoritmo Bubble Sort

public class Util {
    // <T extends Comparable<T>> -> Indica que T debe ser una implementación de Comparable<T>
    // Es decir, que T puede ser cualquier clase que implemente la interface Comparable especializada en T

    // Los métodos (estáticos o no) pueden ser genéricos independientemente de que la clase lo sea. Como ordenar, que es estático y recibe un parámetro de tipo T[].
    // Tipo T no existe en la clase Util, pues esta no es una clase genérica 
    // Por lo tanto el único modo en que ordenar podría recibir un parámetro de este tipo de dato genérico es que el mismo método lo declare, es decir que el método sea genérico

    public static <T extends Comparable<T>> void ordenar(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j + 1].compareTo(arr[j]) < 0) {
                    T aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    // Agregamos este método, que recibe un T[], lo recorre y muestra sus elementos por consola
    // No exigimos que T sea una implementación de Comparable<T>, esto se debe a que no necesitamos invocar el método compareTo
    public static <T> void muestraArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); 
        }
    }
}
