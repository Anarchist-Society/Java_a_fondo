public class CadenasCaracteres {
    public static void main(String[] args) {
        // Determinar la longitud de una cadena
        String s = "Hola";
        int n = s.length(); // Retorna 4
        System.out.println(n);
        System.out.println();

        // Determinar  si una cadena es la cadena vacía
        String s1 = "Hola";
        boolean b1 = s1.isEmpty();
        System.out.println(b1);
        System.out.println();

        String s2 = "";
        boolean b2 = s2.isEmpty();
        System.out.println(b2);
        System.out.println();

        // Acceder a los caracteres de una cadena
        String t = "Hola";
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            System.out.println(c);
        }
        System.out.println();

        // Comparar cadenas
        String x = "Hola";
        String y = "Hola";
        if (x.equals(y)) {
            System.out.println("SI pasa por aquí!");
        }
        System.out.println();

        // Determinar la posición que ocupa un carácter dentro de una cadena
        s = "Hola, cómo estás?";
        int p1 = s.indexOf('a'); // Retorna 3
        int p2 = s.lastIndexOf('a'); // Retorna 14
        System.out.println(p1);
        System.out.println(p2);
        System.out.println();

        // Determinar la posición que ocupa una subcadena dentro de una cadena
        s = "Hola, como estas? Estas como querias?";
        p1 = s.indexOf("como");
        p2 = s.indexOf("estas");
        int p3 = s.lastIndexOf("como");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();

        // Convertir a mayúsculas y minúsculas
        s = "Hola, cómo estás?";
        String may = s.toUpperCase();
        String min = s.toLowerCase();
        System.out.println(may);
        System.out.println(min);
        System.out.println();

        // Subcadenas
        // Posiciones desde (inclusive) y hasta (no inclusive)
        s = "Hola, cómo estás?";
        s1 = s.substring(0, 4);
        s2 = s.substring(6, 10);
        String s3 = s.substring(11);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println();

        // Separar una cadena en varias subcadenas
        s = "Jhon|Paul|George|Ringo";
        String[] beatles = s.split("\\|");
        System.out.println(beatles[0]);
        System.out.println(beatles[1]);
        System.out.println(beatles[2]);
        System.out.println();

        // Conversión entre cadenas y números
        // Enteros
        s1 = "1234";
        int i = Integer.parseInt(s1); // Retorna: 1234
        String t1 = Integer.toString(i); // Retorna: "1234"
        System.out.println(t1);

        // Flotantes
        s2 = "1234.56";
        double d = Double.parseDouble(s2); // Retorna: 1234.56
        String t2 = Double.toString(d); // Retorna: "1234.56"
        System.out.println(t2);
        System.out.println();

        // Concatenar cadenas
        // Podemos usar el operador + para concatenar cadenas de caracteres
        s = "Hola, ";
        t = "que tal?";
        String u = s + t;
        System.out.println(u);
        System.out.println();

        // Invarianza de las cadenas de caracteres
        // La clase String es invariante, es decir, que su contenido no puede ser modificado. Ejemplo:
        s = "Hola";
        s = "chau";
        System.out.println(s);
        System.out.println();

        // Aunque pareciera que sí hemos modificado el conternido de s, en realidad no lo hicimos. Lo que realmente ocurre en este programa es lo siguiente:
        // 1. Se crea la cadena "Hola" y (su dirección de memoria) se asigna s.
        // 2. Luego se crea la cadena "chau" y (su dirección de memoria) se asigna a s.
        // 3. Como s ahora tiene la dirección de "chau", la cadena "hola" quedó desreferenciada, y ya no podremos acceder a ella, porque su dirección de memoria no quedó guardada en ninguna variable (objeto).
        
        // Algo similar sucede en el siguiente caso:
        s = "Hola";
        s = s + ", chau"; // Concatenamos?
        System.out.println(s);
        
        // Aunque parece que le concatenamos caracteres a la cadena s, en realidad le hemos asignado a s la dirección de una nueva cadena, "Hola, chau", dejando desreferenciada la cadena "Hola".
    }
}
