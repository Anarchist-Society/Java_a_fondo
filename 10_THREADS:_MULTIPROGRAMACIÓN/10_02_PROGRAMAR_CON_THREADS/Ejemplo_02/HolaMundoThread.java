// 10.2.1. LA INTERFACE Runnable
// En realidad Thread implementa la interface Runnable. De esta hereda el método run
// En este ejemplo en vez de extender de Thread implementamos la interface Runnable

public class HolaMundoThread implements Runnable {
    private String nombre;

    public HolaMundoThread(String nobmre) {
        this.nombre = nombre;
    }

    public void run() {
        try {
            int x = (int)(Math.random() * 5000);
            Thread.sleep(x);
            System.out.println("Soy: " + nombre + " (" + x + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // En el main en vez de los tres HolaMundoThread, instanciamos directamente tres Thread
    // Donde cada uno recibe en su constructor una instancia de Runnable, es decir la instancia de HolaMundoThread
    public static void main(String[] args) {
        Thread t1 = new Thread(new HolaMundoThread("Juan"));
        Thread t2 = new Thread(new HolaMundoThread("Pedro"));
        Thread t3 = new Thread(new HolaMundoThread("Juan Pedro"));

        t1.start();
        t2.start();
        t3.start();

        // Ambas versiones del programa son equivalentes, sin embargo la segunda es más flexible, pues no restringe la herencia de la clase
    }
}
