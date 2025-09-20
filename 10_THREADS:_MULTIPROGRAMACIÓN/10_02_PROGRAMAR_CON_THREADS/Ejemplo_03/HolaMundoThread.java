// 10.2.2. ESPERAR HASTA QUE FINALICE UN THREAD
// En ocasiones tenemos la necesidad de esperar a que finalice un thread, o grupo de threads, para continuar con otras tareas
// Sin embargo como los hilos se ejecutan en paralelo pasará lo siguiente:

public class HolaMundoThread implements Runnable {
    private String nombre;

    public HolaMundoThread(String nombre) {
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

    public static void main(String[] args) throws InterruptedException {
        // Thread t1 = new Thread(new HolaMundoThread("Juan"));
        // Thread t2 = new Thread(new HolaMundoThread("Pedro"));
        // Thread t3 = new Thread(new HolaMundoThread("Juan Pedro"));

        // // La salida del programa siempre será "Finalizó el programa", seguido de los tres nombre en orden aleatorio
        // t1.start();
        // t2.start();
        // t3.start();

        // System.out.println("Finalizó el programa");

        // Para hacer que el mensaje de finalización del programa aparezca una vez que los tres hayan finalizado su método run, tendremo que esperar a que termine cada uno de ellos
        // Para ello utilizaremos el método join

        Thread t1 = new Thread(new HolaMundoThread("Juan"));
        Thread t2 = new Thread(new HolaMundoThread("Pedro"));
        Thread t3 = new Thread(new HolaMundoThread("Juan Pedro"));

        t1.start();
        t2.start();
        t3.start();

        t1.join(); // Esperamos a que finalice t1
        t2.join(); // Esperamos a que finalice t2
        t3.join(); // Esperamos a que finalice t3

        System.out.println("Finalizó el programa");
    }
}
