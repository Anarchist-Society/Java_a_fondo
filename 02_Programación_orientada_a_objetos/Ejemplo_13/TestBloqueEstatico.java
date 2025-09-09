// Dentro de un bloque estático podemos escribir código para que se ejecute una única vez, justo antes de instanciar el primer objeto de la clase

public class TestBloqueEstatico {
    // Bloque estático 
    static {
        System.out.println("-- Bloque estático --");
    }

    // Constructor
    public TestBloqueEstatico(String n) {
        System.out.println("Constructor: " + n);
    }

    public static void main(String[] args) {
        // Instanciamos tres objetos de la clase
        new TestBloqueEstatico("Juan");
        new TestBloqueEstatico("Pedro");
        new TestBloqueEstatico("Pablo");
    }
}
