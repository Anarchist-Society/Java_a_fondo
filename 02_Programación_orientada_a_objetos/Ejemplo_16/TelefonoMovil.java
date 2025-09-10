public class TelefonoMovil extends Telefono implements Comunicador {
    // Implementación
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
}
