import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Cliente {
    public static void main(String[] args) {
        try {
            // Instancio un DatagramSocket
            DatagramSocket datagramSocket = new DatagramSocket();

            // Buffer con info para enviar
            byte[] mensaje = "Pablo".getBytes();

            // IP del server
            byte[] ip = {127,0,0,1};
            InetAddress address = InetAddress.getByAddress(ip);

            int port = 5432;

            // Paquete de información que enviar, ip + port (5432)
            DatagramPacket datagramPacket = new DatagramPacket(mensaje, mensaje.length, address, port);

            // Envío el paquete
            datagramSocket.send(datagramPacket);

            // Buffer para recibir la respuesta
            byte[] respuesta = new byte[256];
            datagramPacket = new DatagramPacket(respuesta, respuesta.length, address, port);

            // Recibo el saludo
            datagramSocket.receive(datagramPacket);

            // Muestro el saludo
            String saludo = new String(datagramPacket.getData());

            System.out.println(saludo);
            datagramSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
