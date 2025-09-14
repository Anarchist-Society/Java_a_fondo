import java.io.FileOutputStream;
import java.util.Properties;

public class TestLogin {
    public static void main(String[] args) {
        crearFichero();

        try {
            Aplicacion app = new Aplicacion();

            // Intentemos el login
            Usuario usuario = app.login("juan", "juan123");

            if (usuario != null) {
                // Mostramos el resultado
                System.out.println(usuario);
            } else {
                String err = "Usario y/o password incorrecto";
                System.out.println(err);
            }
        } catch (Exception e) {
            // Ocurrió un error
            System.out.println("Fuera de servicio");
            System.out.println("Intente más tarde");
            System.out.println(e.getMessage());
        }
    }
    
    public static void crearFichero() {
        // Para el ejemplo voy a crear una nueva Property con el username y la password
        Properties properties = new Properties();
        properties.setProperty("username", "juan");
        properties.setProperty("password", "juan123");

        // Lo grabamos en un fichero
        try {
            String fichero = "./Aplicacion.properties";
            FileOutputStream fos = new FileOutputStream(fichero);
            properties.store(fos, "Comentario");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
