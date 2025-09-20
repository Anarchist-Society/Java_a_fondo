// 10.2.3. CICLO DE VIDE DE UN THREAD

public class MiThread extends Thread {
    private String nombre;

    public MiThread(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(nombre + " - " + i);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        MiThread t1 = new MiThread("Pablo");
        MiThread t2 = new MiThread("Pedro");

        t1.start();
        t2.start();

        // La salida será:
        // Pablo - 0
        // Pedro - 0
        // Pedro - 1
        // Pablo - 1
        // Pedro - 2
        // Pablo - 2
        // Pedro - 3
        // Pablo - 3
        // Pedro - 4
        // Pablo - 4

        // Esto demuestra que el scheduler distribuye uniformemente el tiempo de procesador entre hilos que se están ejecutando
    }
}
