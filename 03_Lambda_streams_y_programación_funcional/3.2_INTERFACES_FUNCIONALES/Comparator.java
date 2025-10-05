// 3.2. INTERFACES FUNCIONALES
// Cuando una interface declara un único método, decimos que se trata de una interface funcional.
// En este ejemplo la interface Comparator es funcional, pues declara un único método -> compare.
// @FunctionalInterface -> es opcional y sirve para que el compilador constate que tiene exactamente un único método.
// Todas las interfaces que declaren un único método son funcionales.

@FunctionalInterface
public interface Comparator<T> {
    public int compare(T a, T b);
}
