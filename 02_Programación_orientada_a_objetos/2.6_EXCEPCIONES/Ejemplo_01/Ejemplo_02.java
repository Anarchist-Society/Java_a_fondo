import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ejemplo_02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("unFichero.txt");
            int c = fis.read();
            System.out.println(c);
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Se ha producido un error: No se ha encontrado el fichero");
        } catch (Exception e) {
            System.out.println("Se ha producido un error: No se puede leer el primer carácter");
        }
    }
}
