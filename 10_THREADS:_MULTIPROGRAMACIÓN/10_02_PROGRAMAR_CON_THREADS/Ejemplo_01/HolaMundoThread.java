// Un thread es una instancia de alguna clase que extiende a Thread y sobreescribe el método run. Este método es secuencial
// Es allí donde debemos programar la tarea que el proceso concurrente llevará a cabo:
// El siguiente ejemplo, extiende a Thread y sobreescribe el método run para hacer lo siguiente:
// - Duerme una cantidad aleatoria de milisengundo(0 y 4999)
// - Cuando se despierta escribe en pantalla el nombre que recibió como parámetro en el constructor y muestra cuánto tiempo durmió

public class HolaMundoThread extends Thread {
    private String nombre;

    // Constructor
    public HolaMundoThread(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            int x = (int)(Math.random() * 5000);
            Thread.sleep(x);
            System.out.println("Soy: " + nombre + " (" + x + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Instanciamos tres HolaMundoThread
        HolaMundoThread t1 = new HolaMundoThread("Juan");
        HolaMundoThread t2 = new HolaMundoThread("Pedro");
        HolaMundoThread t3 = new HolaMundoThread("Juan Pedro");

        // Y los ejecutamos concurrentemente, invocando sobre cada uno, el método start
        // Este método run que sobreescribimos en HolaMundoThread
        t1.start();
        t2.start();
        t3.start();

        System.out.println();

        // La salida será aleatoria, pues cada thread dormirá una cantidad diferente de milisengundos. Por lo tanto, quien duerma menos tiempo será el primero en escribir su nombre
        // IMPORTANTE: para que estos hilos sean ejecutados concurrentemente, tenemos que invocar el método start. Este será quien invoque el método run

        // Si en lugar de invocar start invocamos run el programa será lineal y los métodos run de cada hilo se ejecutarán secuencialmente, en el orden en el que fueron invocados
        t1.run();
        t2.run();
        t3.run();
    }
}
