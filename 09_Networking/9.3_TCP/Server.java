// 9.3.2. UN CLIENTE/SERVIDOR SENCILLO EN JAVA
// La siguiente aplicación, el cliente se conecta al server, le envía su nombre (una cadena) y este retorna un saludo personalizado (otra cadena de caracteres).

// 9.3.2.1. El server
// Debe permanecer esperando hasta que algún cliente establezca una conexión.
// Para implementar esta espera, utilizaremos una instancia de ServerSocket. Cuando se establezca una conexión con el cliente, ServerSocket retorna una instancia de Socket,
// con lo que ambos extremos de la comunicación cliente/servidor quedan vinculados.
// El método accept de ServerSocket es bloqueante, es decir, que el programa quedará detenido en esa línea y no avanzará hasta que reciba la conexión de un cliente.

import java.io.IOException;
import java.io.ObjectInputStream; // Permiten leer y escribir objetos a través del socket
import java.io.ObjectOutputStream; // Permiten leer y escribir objetos a través del socket
import java.net.ServerSocket; // Permite crear un servidor que escucha conexiones entrantes
import java.net.Socket; // Representa la conexión entre cliente y servidor

public class Server {
    public static void main(String[] args) throws IOException {
        // Se inicializan como null, se usarán luego para comunicarse con el cliente
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;

        // Instanciamos ServerSocket indicando en que puerto atenderá
        ServerSocket serverSocket = new ServerSocket(5432); // Se crea en el puerto 5432
        Socket socket = null; // Representa la conexión específica de cada cliente

        while (true) {
            try {
                // Bloqueante: solo pasamos cuando llega un cliente
                socket  = serverSocket.accept(); // Bloquea el programa hasta que un cliente se conecte
                                                 // Cuando se conecte, se devuelve un Socket para esa conexión

                // Información en la consola
                String ip = socket.getInetAddress().toString();
                System.out.println("Se conectaron desde la IP: " + ip);

                // Enmascaramos la entrada y salida de bytes
                ois = new ObjectInputStream(socket.getInputStream()); // Para leer objetos enviados por el cliente
                oos = new ObjectOutputStream(socket.getOutputStream()); // Para enviar objetos al cliente

                // Leemos el nombre que envía el cliente
                String nom = (String)ois.readObject(); // El servidor espera que el cliente envíe un String con su nombre
                                                       // readObject() devuelve un Object, por eso se hace cast

                // Confeccionamos el resultado que le vamos a enviar
                long ts = System.currentTimeMillis(); // Se obtiene el timestamp actual
                String saludo = "Hola Mundo, " + nom + " (" + ts + ")";

                // Se lo enviamos al cliente
                oos.writeObject(saludo);

                System.out.println("Saludo enviado...");

                socket.close();
                serverSocket.close(); // Cierra el servidor después de un cliente
                break;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (oos != null) { oos.close(); }
                if (ois != null) { ois.close(); }
                if (socket != null ) { socket.close(); }
                System.out.println("Conexión cerrada");
            }
        }
    }
}
