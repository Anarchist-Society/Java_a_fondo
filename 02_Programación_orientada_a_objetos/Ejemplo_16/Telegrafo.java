public class Telegrafo extends Antiguedad implements Comunicador {
    // Implementación
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
}
