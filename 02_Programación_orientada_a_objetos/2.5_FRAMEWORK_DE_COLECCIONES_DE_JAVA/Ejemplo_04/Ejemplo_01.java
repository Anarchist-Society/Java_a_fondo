// Al igual que Map, la clase Properties (propiedades) respresentan un conjunto de pares {clave, valor}. Sin embargo ambos elementos deben ser cadenas
// Properties extiende a Hashtable, es un implementación de Map. Su función especial de grabar y leer propiedades en ficheros de texto

import java.util.Properties;

public class Ejemplo_01 {
    public static void main(String[] args) {
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
    }
}
