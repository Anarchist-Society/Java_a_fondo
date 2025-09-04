// Como String es invariante, existen otras clases que sí permiten modificar el contenido de una cadena, sin que esto implique  crear nuevos objetos: StringBuffer y StringBuilder
// StringBuffer y StringBuilder representan cadenas dinámicas que pueden crecer y decrecer, y sus caracteres pueden ser modificados.

public class CadenasCaracteresDinamicas {
    public static void main(String[] args) {
        // Concatenar cadenas de caracteres
        StringBuilder sb = new StringBuilder();
        sb.append("Hola, ");
        sb.append("Chau");

        String r = sb.toString();
        System.out.println(r);

        // Modificar los caracteres de una cadena
        StringBuilder sb1 = new StringBuilder("Hola");
        sb1.setCharAt(2, 'X');
        System.out.println(sb1);
    }
}
