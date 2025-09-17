// Para que el cliente se pueda conectar con el servidor, tiene que conocer su IP y su PUERTO. En este ejemplo suponemos que el cliente y server se ejecutan sobre la misma
// máquina, por lo tanto utilizamos la dirección de localhost

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        Socket socket = null;

        try {
            // Instanciamos el server con la IP y el PORT
            socket = new Socket("127.0.0.1", 5432);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());

            // Enviamos un nombre
            oos.writeObject("Elliot");

            // Recibimos la respuesta (el saludo personalizado)
            String ret = (String)ois.readObject();

            // Mostramos la respuesta
            System.out.println(ret);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
                if (oos != null) { oos.close(); }
                if (ois != null) { ois.close(); }
                if (socket != null ) { socket.close(); }
        }
    }
}
