/* Las clases son tipos de datos definidos por el programador
 * Los objetos son variables cuyo tipo de dato es un clase
 * String es un clase, las cadenas de caracteres son objetos
 * */

public class ClasesObjetos {
    public static void main(String[] args) {
        int a;
        String s;

        /* Los objetos son punteros, es decir que son variables cuyo contenido es una dirección de memoria, esto es importante saberlo porque cuando comparemos objetos
        obtendremos resultados diferentes */

        a = 5;
        int b = 5;

        if (a == b) {
            System.out.println("true");
        }

        String x = "Hola";
        String y = "Hola";

        if (x == y) {
            // false
        } else {
            System.out.println("Nunca se cumple");
        }

        y = x;
        if (x == y) {
            System.out.println("Esto si se cumple, porque solo existe una cadena \"Hola\", ubicada a partir de una única dirección de memoria, ambos punteros x e y contienen esa dirección");
        }
    }
}
