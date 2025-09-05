// Idem anterior, pero el programa debe mostrar los primeros n términos de la serie de Fibonacci.

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        metodo_02();
    }

    public static void metodo_01() {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int suma = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + suma);
            n1 = n2;
            n2 = suma;
        }
        sc.close();
    }

    public static void metodo_02() {
        Scanner sc = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(n1 + (i < n - 1 ? "," : "\n"));
            int suma = n1 + n2;
            n1 = n2;
            n2 = suma;
        }
        sc.close();
    }
}
