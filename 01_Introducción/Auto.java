/* Las clases son estructuras que agrupan datos y funciones. Por esto decimos que los objetos son variables cuyo tipo de dato es una clase,
 * guardan en su interior los datos y las funciones que su propia clase agrupa y declara
 * */

public class Auto {
    private String color;

    public void asignarColor(String c) {
        color = c;
    }

    // Podemos usar la clase auto de la siguiente manera
    public static void main(String[] args) {
        Auto auto = new Auto(); 
        auto.asignarColor("Rojo");
    }
}
