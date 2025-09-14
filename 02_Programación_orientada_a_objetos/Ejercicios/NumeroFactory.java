// Programa la clase NúmeroFactory que permita crear instancias de los diferentes tipos de números.

public class NumeroFactory {
    public static Numero crearNumero(int valor) {
        return new Entero(valor);
    }

    public static Numero crearNumero(double valor) {
        return new Real(valor);
    }

    public static Numero crearNumero(int numerador, int denominador) {
        return new Fraccion(numerador, denominador);
    }
}
