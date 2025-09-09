public class TestNumero {
    public static void main(String[] args) {
        // Sumamos utilizando el método estático
        double d = Numero.sumar(2, 3);
        System.out.println(d);

        // Sumamos utilizando el método de instnacia;
        Numero n1 = new Numero(5);
        n1.sumar(4);
        // Salida: 9 
        System.out.println(n1);
    
        // Sumamos concatenando invocaciones al método sumar
        n1.sumar(4).sumar(6).sumar(8).sumar(1);

        // Salida: 28
        System.out.println(n1);
    }
}
