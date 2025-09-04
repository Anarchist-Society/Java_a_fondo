public class Operadores_Aritmeticos_Relacionales_Logicos {
    public static void aritmeticos() {
        int a  = 1, b = 2, c = 0;
        c = a + b; // Suma
        c = a - b; // Resta
        c = a * b; // Multiplicación
        c = a / b; // División
        c = a % b; // Residuo (o módulo)
        a++; // Equivale: a = a + 1
        a--; // Equivale: a = a - 1
        a += b; // Equivale: a = a + b
        a -= b; // Equivale: a = a - b
        a *= b; // Equivale: a = a * b
        a /= b; // Equivale: a = a / b
    }

    public static void relacionales() {
        int a = 0, b = 1;
        boolean c;

        c = a < b; // true si a < b
        c = a > b; // true si a > b
        c = a == b; // true si a = b
        c = a <= b; // true si a <= b
        c = a >= b; // true si a >= b
        c = a != b; // true si a != b
    }

    public static void logicos() {
        boolean b = true, p = true, q = false;
        b = p && q; // AND, Producto lógico
        b = p || q; // OR, Suma lógica
        b = !p; // NOT, Negación (en este caso: NOT p)
    }
}
