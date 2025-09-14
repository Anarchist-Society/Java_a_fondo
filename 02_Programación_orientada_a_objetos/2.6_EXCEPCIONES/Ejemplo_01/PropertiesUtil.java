// 2.5.6.4. Simplificando el modo en que accedemos a un fichero de propiedades

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    private static Properties _geProperties(InputStream is) throws Exception {
        Properties properties = new Properties();
        properties.load(is);
        return properties;
    }

    // Vamos a sobrecargar el método getProperties, la primera versión recibe el nombre completo del fichero
    // Simplemente lo leerá y retornará su contenido en una instancias de Properties
    // Leemos las propiedades desde un InputStream
    public static Properties getProperties(String filename) {
        try (FileInputStream fis = new FileInputStream(filename)) {
            return _geProperties(fis);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    // La segunda versión recibe una instancia de Class, y asumirá que el nombre del fichero y su ubicación coinciden con el nombre de la clase y el paquete al que pertenece
    public static Properties getProperties(Class<?> clazz) {
        // Obtenemos el nombre del fichero
        String fname = clazz.getName().replace('.', '/');
        fname += ".properties";

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        try (InputStream is = loader.getResourceAsStream(fname)) {
            return _geProperties(is);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        Properties properties = PropertiesUtil.getProperties("persona.properties");
        // La versión sobreescrita de getProperties hace posible que un fichero de propiedades esté vinculado a una clase
        System.out.println(properties);
    }
}
