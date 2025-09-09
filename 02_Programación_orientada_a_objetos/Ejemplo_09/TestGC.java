// Las clases heredan de Object el método finalize. El garbage collector lo invocará justo antes de destruir las instancias que han quedado desreferenciadas
// Al sobreescribirlo indicamos qué queremos que hagan los objetos antes de morir

public class TestGC {
    private static int cont = 0;

    public TestGC() {
        cont++;
        System.out.println(cont);
    }

    @Override
    public void finalize() {
        cont--;
    }

    public static void main(String[] args) {
        while (true) {
            new TestGC();
        }
    }
}
