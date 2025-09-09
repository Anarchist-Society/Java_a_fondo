public class Math {
    // Cualquier variable que declaramos con el modificador final se convierte en una constante
    // Al ser declaradas como static se pueden acceder a ella desde Cualquier otra clase
    public static final double PI = 3.1415;
    public static final double E = 2.7182;
    
    public static void main(String[] args) {
        double pi = Math.PI; 
        double e = Math.E;

        System.out.println(pi);
        System.out.println(e);
    }
}
