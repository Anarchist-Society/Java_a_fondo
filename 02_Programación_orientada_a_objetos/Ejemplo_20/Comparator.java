// INTERFACE Comparator
// Esta interface del paquete java.util tiene exactamente la misma funcionalidad que Criterio
// Como Comparator forma parte de la biblioteca de clases e interfaces de Java, Criterio ya no tiene sentido, así que reemplazaremos el uso de la interface Criterio
// en Util.ordenar por Comparator

public interface Comparator<T> {
    public int compare(T a, T b);
}
