import masclases.FechaDetallada;

public class MuestraConjunto {
    public static void mostrar(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Object[] x = {5, "Hola", new FechaDetallada("2/10/2023")};
        MuestraConjunto.mostrar(x);
    }
}
