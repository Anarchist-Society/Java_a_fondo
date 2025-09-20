public class Test {
    public static void main(String[] args) {
        Monitor monitor = new Monitor(3);
        Productor productor = new Productor(monitor, 6, 2000);
        Consumidor consumidor = new Consumidor(monitor, 6, 4000);
        productor.start();
        consumidor.start();
    }
}
