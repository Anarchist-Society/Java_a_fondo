// Programar las clases Entero y Real, para representar números enteros y números reales respectivamente. Ambas clases deben extender de Número y sobreescribir sumar.

public class Entero extends Numero {
    private int valor;

    public Entero (int valor) {
        this.valor = valor;
    }

    public int getValor() { return valor; }
    public void setValor(int valor) { this.valor = valor; }

    @Override
    public String toString() {
        return Integer.toString(valor);
    }

    @Override
    public Numero sumar(Numero numero) {
        Entero entero = (Entero) numero;
        return new Entero(valor + entero.valor);
    }
}
