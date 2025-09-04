import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Ingrese un valor: ");
        int n = sc.nextInt();

        double factorial = factorial(n);
        System.out.println("El factorial de " + n + ": " + factorial);

        boolean p = esPrimo(n);
        String mensaje = (p) ? " es " : " no es ";
        System.out.println(n + mensaje + "primo");

        sc.close();
    }

    // Calcula el factorial de n
    public static double factorial(int n) {
        double factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i ;
        }

        return factorial;
    }

    // Determina si un número es primo o no
    public static boolean esPrimo(int n) {
        int i = 2;
        while (n % i != 0 && i < n) {
            i++;
        }

        return i == n; // Retorna true si son iguales
    }
} 
