// Al igual que Map, la clase Properties (propiedades) respresentan un conjunto de pares {clave, valor}. Sin embargo ambos elementos deben ser cadenas
// Properties extiende a Hashtable, es un implementación de Map. Su función especial de grabar y leer propiedades en ficheros de texto

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Ejemplo_01 {
    // 2.5.6.1. Grabar properties es un fichero de texto
    public static void grabar() {
        // Declaramos una instancia de Properties
        Properties properties = new Properties();

        // Asignamos propiedades y valores
        properties.setProperty("nombre", "Pablo");
        properties.setProperty("apellido", "Sznajdleder");
        properties.setProperty("FechaNacimiento", "24/5/1970");
        properties.setProperty("dni", "23122343");
        properties.setProperty("direccion", "Av. Del Libertador 2312");

        // Obtenemos el valor de una propiedad
        String dir = properties.getProperty("direccion");
        System.out.println(dir);

        // Intentamos leer el valor de una propiedad que no existe
        String edad = properties.getProperty("edad");
        System.out.println(edad); // Como no hemos asignado la propiedad edad retornará null

        // El método store grabe en un fichero de texto las properties que contiene una instancia de properties
        try {
            String filename = "./persona.properties";
            FileOutputStream fos = new FileOutputStream(filename);
            properties.store(fos, "Esto es un comentario");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // 2.5.6.2. Leer properties almacenadas en un fichero de texto
    public static void leer() {
        // El método load lee las propiedades de un fichero de texto y les agrega a una instancia de properties
        try {
            // Creamos la instancia, abrimos el fichero y lo leemos 
            Properties properties = new Properties();
            String filename = "./persona.properties";
            FileInputStream fis = new FileInputStream(filename);
            properties.load(fis);

            System.out.println(properties.get("nombre"));
            System.out.println(properties.get("apellido"));
            System.out.println(properties.get("direccion"));
            System.out.println(properties.get("edam"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        grabar();
        System.out.println();
        leer();
    }

}
