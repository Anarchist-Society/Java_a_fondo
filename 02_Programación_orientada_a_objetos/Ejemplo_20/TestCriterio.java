public class TestCriterio {
    public static void main(String[] args) {
        Integer[] x = {2,5,3,9,7,1,6};

        // Ordeno de menor a mayor
        System.out.println("De menor a mayor");
        Comparator<Integer> c1 = (a,b) -> { return a - b; };
        Util.ordenar(x, c1);
        Util.imprimir(x);

        // Ordeno de mayor a menor
        System.out.println("\nDe mayor a menor");
        Comparator<Integer> c2 = (a,b) -> { return b - a; };
        Util.ordenar(x, c2);
        Util.imprimir(x);
    }
}
