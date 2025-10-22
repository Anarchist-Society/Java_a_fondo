// 3.4.1. LA INTERFACE Predicate
// Esta interface, representa a una función que recibe un único parámetro tipo T. Retorna un valor booleano.

// Utilizaremos esta interface para programar el método estático filter, cuyo objetivo es filtrar los elementos de una colección y obtener solo aquellos que cumplen una determinada condición.

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Predicate<T> {
    public boolean test(T t);
}

// El método filter debe recibir la colección con los elementos que queremos filtrar y un predicado que permita establecer si un elemento de la colección cumple o no con la condición deseada.
public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
    // Lista que va a contener los elementos
    // que cumplen con la condición del filtro
    List<T> ret = new ArrayList<>();

    // Itereamos la lista a filtrar....
    for (T t : list) {
        if (predicate.test(t)) {
            ret.add(t);
        }
    }

    return ret;
}
