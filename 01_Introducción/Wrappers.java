public class Wrappers {
    public static void main(String[] args) {
        /* Para cada uno de los tipos primitivos existe una clase que lo representa. Permite realizar diferentes operaciones relacionadas con el tipo de dato en cuestión.
         * A estas clases las llamaremos wrappers o envoltorios.
         * Tipo primitivo | Wrapper
         *           byte   Byte
         *           char   Char
         *          short   Short
         *            int   Integer
         *           long   Long
         *          float   Float
         *         double   Double
         *        boolean   Boolean
         * */

        int i = 1234;

        String  a = Integer.toString(i);
        System.out.println(a);

        String b = Integer.toBinaryString(i);
        System.out.println(b);

        String c = Integer.toHexString(i);
        System.out.println(c);

        String d = "1234";

        int j = Integer.parseInt(d);
        System.out.println(j);

        // Autoboxing: conversión automática entre tipos primitivos y wrappers
        Integer k = new Integer(1234);
        int l = k;
        System.out.println(l);

        // Los wrappers pueden contener null

        int n = new Integer(567);
        System.out.println(n);
    }
}
