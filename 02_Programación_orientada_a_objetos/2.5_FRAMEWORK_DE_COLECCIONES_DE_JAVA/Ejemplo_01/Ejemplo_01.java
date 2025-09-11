import java.util.ArrayList;
import java.util.List;

public class Ejemplo_01 {
    public static void main(String[] args) {
        // Colección de cadenas 
        ArrayList<String> a = new ArrayList<>();

        // Le asigno algunos valores
        a.add("Pablo");
        a.add("Juan");
        a.add("Carlos");

        for (int i = 0; i < a.size(); i++) {
            // El método get retorna el i-esimo elemento
            String aux = a.get(i);
            System.out.println(aux);
        }
        System.out.println();

        // También podemos hacer esto para no tener en cuenta la implementacion concreta de List, para ello he creado otra clase llamada NombresUtil y un método llamado obtenerLista()
        List<String> list = NombresUtil.obtenerLista();
        for (String nom : list) {
            System.out.println(nom);
        }
    }
}
