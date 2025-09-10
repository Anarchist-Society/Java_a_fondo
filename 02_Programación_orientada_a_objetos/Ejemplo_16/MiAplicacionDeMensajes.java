// Utilizando la clase ComunicadorManager, podremos obtener una instancia de Comunicador

public class MiAplicacionDeMensajes {
    public static void main(String[] args) {
        /* Al modificar ComunicadorManager, de cambiar de paloma mensajera a teléfono móvil no tiene un impacto en esta clase
         * Al crear el método crearComunicador de la clase ComunicadorManager nos permitió obtener una instancia de Comunicador
         * y hacer abstracción respecto de cuál es la implementación concreta. Gracias a este método, el programa quedó desacoplado
         * de la implementación Comunicador, es decir que quedó totalmente separado de esta implementación, que no depende de la clase Comunicador
         * Por lo que el método crearComunicador es una fábrica de objetos comunicadores. Lo invocamos para obtener una instancia de Comunicador y desentendernos de su clase
         * o tipo. Diremos que crearComunicador es una factoría de objetos denominado FACTORY METHOD.
         * */
        Comunicador c = ComunicadorManager.crearComunicador();
        c.enviarMensaje("Hola este es mi mensaje");
    }
}
