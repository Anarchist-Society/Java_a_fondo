// Idem anterior para mostrar los primeros n múltiplos de a que no son múltiplos de b, siendo n, a y b valores que el usuario ingresará por teclado.

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce n: ");
        int n = sc.nextInt();

        System.out.print("Introduce a: ");
        int a = sc.nextInt();

        System.out.print("Introduce b: ");
        int b = sc.nextInt();

        int i = 0;
        int multiplo = 1;
        while (i < n) {
            if ((a * multiplo) % b != 0)  {
                System.out.println(a * multiplo);
                i++;
                multiplo++;
            } else {
                multiplo++;
            }
        }
        sc.close();
    }
}
