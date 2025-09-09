// Los métodos que declaramos estáticos se convierten en métodos de la clase. Pueden ser invocados directamente sin necesidad de instanciarla
// Para saber cuando un método debería ser de clase, habría que preguntarnos si su valor de retorno se puede calcular en función de sus parámetros,
// sin la necesidad de acceder a las variables de instancia, estos serán métodos de clase

public class Numero {
    // Agregamos una variable de instancia, que permite guardar un valor concreto para cada objeto
    // Atributo
    private double valor;

    // Constructor
    public  Numero(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return Double.toString(valor);
    }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    // En este ejemplo, el valor de retorno del método sumar depende exclusivamente de los valores de sus parámetros
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Ahora voy a sobrecargar el método sumar para que reciba un único parámetro, el cual lo sumará al valor actual del atributo valor
    // Esté método sí será un método de instancia (no estático), ya que modificará el valor de una variable de instancia
    public Numero sumar(double a) {
        valor += a; // Modificamos la variable de instancia
        return this;
    }
}
