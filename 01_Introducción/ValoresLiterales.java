public class ValoresLiterales {
    public static void main(String[] args) {
        // Literal de tipo char
        char c = 'A';

        // Literal de tipo int
        int i  = 1234;

        // Literal de tipo boolean (true o false)
        boolean b = true;

        // Literal de tipo double
        double d = 3.14;

        // Literal de tipo String
        String s = "Hola";

        // Literal de tipo float
        // Por defecto los valores literales numéricos con decimales son double. Para expresar un valor de tipo float tenemos que agregarle el sufijo f
        float f = 3.14f;

        // Valor entero expresado en sistema binario
        int binario = 0b00000101_00111001_01111111_10110001;
        System.out.println(binario);

        binario = 0b101_00111001_01111111_10110001;
        System.out.println(binario); // También vale así

        System.out.println();

        // Valor expresado en hexadecimal
        binario = 0b0101_0011_1001_0111_1111_1011_0001;
        int hexadecimal1 = 0x5397FB1;
        int hexadecimal2 = 0x5____3____9____7____F____B____1;
        System.out.println(binario);
        System.out.println(hexadecimal1);
        System.out.println(hexadecimal2);

        System.out.println();

        // Valor expresado en octal
        binario = 0b101_001_110_010_111_111_110_110_001;
        int octal1 = 05___1___6___2___7___7___6___6___1;
        int octal2 = 000516277661;
        System.out.println(binario);
        System.out.println(octal1);
        System.out.println(octal2);
    }
}
