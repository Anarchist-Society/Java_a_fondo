// Escribir un programa para mostrar los primeros n números primos, siendo n un valor que el usuario ingresará por teclado.

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        metodo_02();
    }

    public static void metodo_01() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }

    public static void metodo_02() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int numero = 2;
        while (i < n) {
            if (esPrimo(numero)) {
                System.out.println(numero); 
                i++;
            }
            numero++;
        }
        sc.close();
    }

    public static boolean esPrimo(int x) {
        int i = 2;
        while (x % i != 0 && i < x) {
            i++;
        }
        return i == x;
    }
}
