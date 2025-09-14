import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ejemplo_01 {
    public static void main(String[] args) {
    }

    // Las excepciones declarativas son aquellas que obligan al programador a encerrar las llamadas en un bloque try-catch 
    public static void excepcionesDeclarativas() {
        try {
            FileInputStream fis = new FileInputStream("unFichero.txt");
            System.out.println(fis);
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
            // Mostramos la pila de llamadas por consola
            e.printStackTrace(); // Básicamente es el error que siempre muestra
        }
    }

    // Otra forma de hacerlo sería:
    public static void excepcionesDeclarativasPropagada() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("unFichero.txt");
        System.out.println(fis);
    }

    // Las excepciones no declarativas son aquellas pueden ocurrir aún sin que el método las declare y sin que el programador las encierre en un bloque try catch
    public static void excepcionesNoDeclarativas() {
        // Un array con capacidad para 3 valores  enteros
        int[] arr = {1,2,3};

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
