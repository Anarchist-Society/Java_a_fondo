public class Consumidor extends Thread {
    private Monitor buff;
    private int n;
    private int sleep;

    public Consumidor(Monitor buff, int n, int sleep) {
        this.buff = buff;
        this.n = n;
        this.sleep = sleep;
    }

    @Override
    public void run() {
        try {
            char c; 
            for (int i = 0; i < n; i++) {
                c = buff.sacar();
                System.out.println("Consumir: " + c);
                sleep((int)(Math.random() * sleep));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } 
    }
}
