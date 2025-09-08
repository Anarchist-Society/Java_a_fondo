/* Decimos que los objetos son instancias de las clases porque los valores de cada uno de sus atributos varían de un objeto a otro.
 * Ejemplo: si pensamos en la clase persona, y esta tuviera los atributos nombre y fechaNacimiento, las instancias de la clase sería las diferentes personas.
 * {"Pablo", 2-10-1970}, {"Juan", 16-08-1985}, {"Pedro", 1996}
 * Las expresiones crear un objeto e instaciar las clase muchas veces se utilizan como sinónimos, aunque no necesariamente insntanciar implica crear un objeto, en el sentido de declarar una variable que lo contenga.
 * */

public class X { 
    private int a;
    private int b;

    public X(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return "(" + a + "," + b + ")";
    }

    public int getA() { return a; }
    public void setA(int a) { this.a = a; }
    public int getB() { return b; }
    public void setB(int b) { this.b = b; }
}
