// Programar las clases Entero y Real, para representar números enteros y números reales respectivamente. Ambas clases deben extender de Número y sobreescribir sumar.

public class Real extends Numero {
    private double valor;

    public Real(double valor) {
        this.valor = valor;
    }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    @Override
    public String toString() {
        return Double.toString(valor);
    }

    @Override
    public Numero sumar(Numero numero) {
        Real real = (Real) numero;
        return new Real(valor + real.valor);
    }
}
