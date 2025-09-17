import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) {
        try {
            // Creamos el socket
            DatagramSocket datagramSocket = new DatagramSocket(5432);

            // Bucle eterno
            while (true) {
                System.out.println("Esperando conexión..."); 

                // Búffer para recibir el nombre del cliente
                byte[] buffer = new byte[256];

                // Recibo el nombre del cliente
                DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
                datagramSocket.receive(datagramPacket);

                System.out.println("Conexión recibida!");

                // Preparo el saludo para enviar
                String nombre = new String(datagramPacket.getData());

                String saludo = "Hola mundo (" + nombre + ") _ " + System.currentTimeMillis();

                System.out.println("Voy a enviar: [" + saludo + "]...");

                // Búffer para enviar el saludo
                byte[] respuesta = saludo.getBytes();

                // Envío el saludo
                InetAddress inetAddress = datagramPacket.getAddress();
                datagramPacket = new DatagramPacket(respuesta, respuesta.length, inetAddress, datagramPacket.getPort());
                
                datagramSocket.send(datagramPacket);
                System.out.println("Saludo enviado!!");

                datagramSocket.close();
                break;
            }
        } catch (Exception e) {
        } 
    }
}
