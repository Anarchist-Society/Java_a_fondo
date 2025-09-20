// Las clases Productor y Consumidor extienden a Thread. Ambas reciben, como parámetro en el constructor, una instancia de Monitor.
// La clase Consumidor, su función es producir caracteres y colocarlos en el buffer invocando el método poner de Monitor.
// La cantidad de caracteres que va a producir dependerá del parámetro n.
// Luego de meter cada carácter en el buffer, duerme una cantidad sleep de milisegundos.

public class Productor extends Thread {
    private Monitor buff;
    private int n;
    private int sleep;

    public Productor(Monitor buff, int n, int sleep) {
        // El monitor
        this.buff = buff;

        // Cuántos caracteres debe producir
        this.n = n;

        // Cuanto tiempo debe dormir entre carácter y carácter
        this.sleep = sleep;
    }

    @Override
    public void run() {
        try {
            char c;
            for (int i = 0; i < n; i++) {
                c = (char) ('A' + i);
                buff.poner(c);
                System.out.println("Produje: " + c);
                sleep((int)(Math.random() * sleep));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
