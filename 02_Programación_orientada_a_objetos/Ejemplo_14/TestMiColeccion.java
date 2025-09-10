public class TestMiColeccion {
    public static void main(String[] args) {
        MiColeccion mc = new MiColeccion();
        mc.insertar("Pedro", 0);
        mc.insertar("Pablo", 0);
        mc.insertar("Juan", 0);

        for (int i = 0; i < mc.cantidad(); i++) {
            String s = (String)mc.obtener(i); // Hacemos un casting
            System.out.println(s);
        }
    }
}
