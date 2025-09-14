import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ejemplo_01 {
    // 2.6.3. EXCEPCIONES DECLARATIVAS Y NO DECLARATIVAS

    // Las excepciones declarativas son aquellas que se declaran en el prototipo del método que las arroja, obligando a quien lo invoque a encerrar la llamada dentro de un bloque try-catch
    public static void excepcionesDeclarativas() {
        try {
            FileInputStream fis = new FileInputStream("unFichero.txt");
            System.out.println(fis);
        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
            // Mostramos la pila de llamadas por consola
            e.printStackTrace();
        }
    }

    // Las excepciones no declarativas no necesitan ser declaradas ni atrapadas con un try-catch, y por lo general son instancias de RuntimeException o subclases de esta
    public static void excepcionesNoDeclarativas() {
        // Un array con capacidad para 3 valores  enteros
        int[] arr = {1,2,3};

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }

    // 2.6.4. STACK TRACE
    // El stack trace sirve para depurar errores, describe la pila de llamadas en el momento en el que ocurre una excepción, provee información sobre el error y dónde ocurrió
}
