// Escribe un Thread que muestre un número aleatorio en la consola. Extendiendo de Thread

import java.util.concurrent.ThreadLocalRandom;

// Cada hilo tendrá: 
// Un número identificador
// Un delay antes de imprimir su número aleatorio
// Usaremos Thread.sleep(delay) para introducir la espera
// Usaremos ThreadLocalRandom para generar los números aleatorios
public class NumeroAleatorioThread extends Thread {
    private int numeroThread;
    private int numeroAleatorioMaximo;
    private int delay;

    // Podemos pasar un número en el constructor
    public NumeroAleatorioThread(int numeroThread, int numeroAleatorioMaximo, int delay) {
        this.numeroThread = numeroThread; // Esto le asigna un identificador a cada hilo
        this.numeroAleatorioMaximo = numeroAleatorioMaximo;
        this.delay = delay;
    }

    // Aquí usamos Math.random()
    // @Override
    // public void run() {
    //     numeroAleatorio = (int)(Math.random() * numeroAleatorioMaximo) + 1; // Esto generará un número aleatorio entre el 1 y el numeroAleatorioMaximo  inclusive
    //     System.out.println(numeroAleatorio);
    // }

    // Aquí vamos a usar ThreadLocalRandomA
    // Es un clase de java.util.concurrent
    // Proporciona un generador de números aleatorios diferentes para cada hilo

    // Agrega un número de thread y un delay al thread antes de que muestre el nombre.
    @Override
    public void run() {
        // Para pausar un hilo usamos Thread.sleep(milisegundos)
        try {
            Thread.sleep(delay); // Espera antes de ejecutar
            int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, numeroAleatorioMaximo + 1);
            System.out.println("Hilo #" + numeroThread + " (" + Thread.currentThread().getName() + "): " + numeroAleatorio);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Escribe un main que instancie 10 threads del que acabas de crear.
    // Aquí lanzamos los hilos en orden, pero con delays distintos para mostrar que el que empieza primero puede terminar después.
    public static void main(String[] args) {
        int numeroHilos = 5;
        int numeroMax = 10;

        // Creamos y arrancamos hilos con delays distintos
        NumeroAleatorioThread hilo1 = new NumeroAleatorioThread(1, numeroMax, 3000);
        NumeroAleatorioThread hilo2 = new NumeroAleatorioThread(2, numeroMax, 1000);
        NumeroAleatorioThread hilo3 = new NumeroAleatorioThread(3, numeroMax, 2000);
        NumeroAleatorioThread hilo4 = new NumeroAleatorioThread(4, numeroMax, 1500);
        NumeroAleatorioThread hilo5 = new NumeroAleatorioThread(5, numeroMax, 500);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();

        // Aunque Hilo #1 se lanza primero, su delay es más largo (3s)
        // Hilos lanzados después, con delays más cortos, terminarán primero
        // Esto verifica el enunciado: el orden de inicio no garantiza el orden de finalización
    }
}

// Verifica que aunque un thread haya sido lanzado primero, este no necesariamente será el primero en finalizar.
// El orden de ejecución de los hilos en Java no está garantizado, incluso si los creas y arrancas en un orden específico.
// Al lanzar un hilo con start(), el hilo se pone en cola para ser ejecutado por el sistema operativo, pero Java no controla exactamente cuándo el hilo obtiene tiempo de CPU.
// Es decir si lanzas hilo1.start() y luego hilo2.start(), eso solo asegura que hilo1 se ponde primero en la cola.
// No garantiza que hilo1 termine antes que hil2, porque:
// Cada hilo puede tardar diferente tiempo en ejecutarse según lo que haga.
// El scheduler del sistema operativo decide cuál hilo se ejecuta y por cuánto tiempo.
// Si un hilo tiene un sleep, esperar por un tiempo, lo que permite que otros hilos terminen antes.
// Imagina 2 hilos:
// Hilo A empieza primero y genera un número aleatorio después de 3 segundos.
// Hilo B empieza después pero genera un número inmediato.
// Aunque Hilo A se lanzó primero, Hilo B terminará antes de que Hilo A imprima su número.
// El orden de inicio start() no determina el orden de finalización.
// Los hilos se ejecutan de manera concurrente, y su finalización depende de:
// Qué tanto trabajo haga cada hilo.
// Del scheduling del sistema operativo
// Del uso de sleep, I/O u otras esperas dentro del hilo
