// 1. Escribir la clase Fracción para representar un número fraccionario
// 2. Analizar qué métodos debe tener y programarlos

public class Fraccion extends Numero {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Denominador no puede ser 0");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() { return numerador; }
    public void setNumerador(int numerador) { this.numerador = numerador; }
    public int getDenominador() { return denominador; }
    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Denominador no puede ser 0");
        }
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    // 4. Hacer que Fracción extienda de Número y sobreescriba el método sumar.
    @Override
    public Numero sumar(Numero numero) {
        Fraccion fraccion = (Fraccion) numero;
        int nuevoNumerador = numerador * fraccion.denominador + denominador * fraccion.numerador;
        int nuevoDenominador = denominador * fraccion.denominador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }
}
