// Map es una interface que representa un conjunto de elementos, cada uno de ellos compuesto por una dupla {clave, valor}.

import java.util.HashMap;

public class Ejemplo_02 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("uno", 1);
        hashMap.put("dos", 2);
        hashMap.put("tres", 3);

        // Recupero el valor asociado a la key "dos"
        int x = hashMap.get("dos");
        System.out.println(x);

        System.out.println();

        // También podemos iterarla por values
        for (int value : hashMap.values()) {
            System.out.println(value);
        }

        System.out.println();


        // También podemos iterar por keys
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
    }
}
