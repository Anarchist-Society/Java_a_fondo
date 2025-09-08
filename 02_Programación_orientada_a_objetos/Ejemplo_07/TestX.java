public class TestX {
    public static void main(String[] args) {
        // Es correcto decir que x1 y x2 son instancias de las clase X
        X x1 = new X(5, 4);
        X x2 = new X(2, 7);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
