/* En java no existe la herencia múltiple, por lo que cada clase tiene un único padre
 * Para ello las interfaces proveen una solución a este tipo de problemas, ya que java en un lenguaje fuertemente tipado
 * Se podría decir que una interface es una clase abstracta pero tiene diferencias ya que las clases abstractas se extienden (usando la palabra extends)
 * Y las Interfaces se implementan (usando la palabra implements)
 *
 * Una clase solo se puede extender a un única clase, es implementar múltiples interfaces, cuyos métodos abstractos deberá sobreescribir, si no será una clase abstracta
 * */

public class Test {
    public static void main(String[] args) {
        // Los objetos teléfono móvil, paloma mensajera y telégrafo tienen una base común. Todos son comunicadores, razón por la cuál, perfectamente podrían ser asignados
        // a variables tipo Comunicador
        Comunicador t1 = new TelefonoMovil();
        Comunicador t2 = new PalomaMensajera();
        Comunicador t3 = new Telegrafo();
    }
}
