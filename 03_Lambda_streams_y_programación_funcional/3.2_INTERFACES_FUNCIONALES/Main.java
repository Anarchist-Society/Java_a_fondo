// 3.2.2. REFERENCIAS A METODOS

public class Main {
    public static void main(String[] args) {
        // Una variable tipo MiFuncion podría contener una referencia (o un puntero) a cualquiera de estos métodos. Para obtener la referencia a un método estático usaremos el operador :: (cuatro puntos)
        MiFuncion p1 = String::valueOf;
        String r1 = p1.invocar(123); // Retorna: "123"
        System.out.println(r1);

        MiFuncion p2 = Integer::toBinaryString;
        String r2 = p2.invocar(255); // Retorna: "11111111"
        System.out.println(r2);

        // La interface MiFuncion ya no será necesaria, pues la podremos reemplazar por Function, del paquete java.util.function
    }
}
