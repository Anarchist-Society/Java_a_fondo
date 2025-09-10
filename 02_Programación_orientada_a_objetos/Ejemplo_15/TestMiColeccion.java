public class TestMiColeccion {
    public static void main(String[] args) {
        // Una colección de cadenas (T es String)
        MiColeccion<String> ms = new MiColeccion<>();

        // Agregamos cadenas
        ms.insertar("uno", 0);
        ms.insertar("dos", 0);
        ms.insertar("tres", 0);

        // Ya no es necesario castear
        for (int i = 0; i < ms.cantidad(); i++) {
            System.out.println(ms.obtener(i));
        }

        // Una colección de enteros
        MiColeccion<Integer> mi = new MiColeccion<>();
        mi.insertar(1, 0);
        mi.insertar(2, 0);
        mi.insertar(3, 0);

        // Ya no es necesario castear
        for (int i = 0; i < mi.cantidad(); i++) {
            System.out.println(mi.obtener(i)); 
        }
    }
}
