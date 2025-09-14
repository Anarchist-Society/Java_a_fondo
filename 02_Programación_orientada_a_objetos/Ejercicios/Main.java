public class Main {
    public static void main(String[] args) {
        // Crear números usando el Factory method
        Numero entero1 = NumeroFactory.crearNumero(5);
        Numero entero2 = NumeroFactory.crearNumero(10);

        Numero real1 = NumeroFactory.crearNumero(1.5);
        Numero real2 = NumeroFactory.crearNumero(2.25);

        Numero fraccion1 = NumeroFactory.crearNumero(1, 2);
        Numero fraccion2 = NumeroFactory.crearNumero(10, 5);

        // Sumar enteros
        Numero sumaEnteros = entero1.sumar(entero2);
        System.out.println(entero1 + " + " + entero2 + " = " + sumaEnteros);

        // Sumar reales
        Numero sumaReales = real1.sumar(real2);
        System.out.println(real1 + " + " + real2 + " = " + sumaReales);

        // Sumar fracciones
        Numero sumaFracciones = fraccion1.sumar(fraccion2);
        System.out.println(fraccion1 + " + " + fraccion2 + " = " + sumaFracciones);
    } 
}
