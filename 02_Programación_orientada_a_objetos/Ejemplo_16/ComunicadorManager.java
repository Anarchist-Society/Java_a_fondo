// 2.4.1. DESACOPLAMIENTO DE CLASES

public class ComunicadorManager {
    // public static Comunicador crearComunicador() {
    //     // Una "paloma mensajera" es un "comunicador"
    //     return new PalomaMensajera();
    // }

    // Imaginemos que queremos enviar un mensaje desde un teléfono móvil
    public static Comunicador crearComunicador() {
        return new TelefonoMovil();
    }
}

