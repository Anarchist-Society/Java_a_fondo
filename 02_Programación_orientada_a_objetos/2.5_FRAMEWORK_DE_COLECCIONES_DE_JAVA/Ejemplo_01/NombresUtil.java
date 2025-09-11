import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NombresUtil {
    // Esto se un factory method, podemos crear un ArrayList, LinkedList...
    // public static List<String> obtenerLista() {
    //     ArrayList<String> a = new ArrayList<>();
    //     a.add("Pablo");
    //     a.add("Juan");
    //     a.add("Carlos");
    //     return a;
    // }

    // Este cambio de implementación no ocasionará ningún impacto negativo en el programa principal, pues el tipo de variable lst es List
    public static List<String> obtenerLista() {
        LinkedList<String> a = new LinkedList<>();
        a.add("Pablo");
        a.add("Juan");
        a.add("Carlos");
        return a;
    }
}
