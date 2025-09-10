public class PalomaMensajera extends Paloma implements Comunicador {
    // Implementación
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
}
