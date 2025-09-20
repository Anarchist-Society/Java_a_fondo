// En este ejercicio es lo mismo que el 1, pero en vez de heredar de Thread, implementamos la interfaz Runnable

public class NumeroAleatorio implements Runnable {
    private int numeroAleatorioMaximo;
    private int numeroAleatorio;

    public NumeroAleatorio(int numeroAleatorioMaximo) {
        this.numeroAleatorioMaximo = numeroAleatorioMaximo;
    }

    @Override
    public void run() {
        numeroAleatorio = (int)(Math.random() * numeroAleatorioMaximo) + 1;
        System.out.println(numeroAleatorio);
    }

    public static void main(String[] args) {
        Thread n1 = new Thread(new NumeroAleatorio(10));
        n1.start();
    }
}
