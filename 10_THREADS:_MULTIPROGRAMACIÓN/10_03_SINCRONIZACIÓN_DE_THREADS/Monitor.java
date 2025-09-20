// Para mostrar como dos o más procesos que comparten un recurso, en común deben ser sincronizados, lo veremos con un esquema cliente/consumidor.
// El proceso productor genera caracteres y los mete en un array. El proceso consumidor toma caracteres del array y los utiliza para realizar una tarea.
// Como el array tiene una capacidad finita, podría llenarse o vaciarse, según resulte que el productor produzca caracteres más rápido de lo que el consumidor los pueda consumir, o viceversa.
// Si el array está lleno, el productor no podrá continuar con su producción de caracteres hasta que el consumidor consuma alguno.
// Si el array se encuentra vacío, el consumidor no tendrá nungún carácter para consumir hasta que el productor produzca alguno y lo meta en el array.
// Además no debería ocurrir que el productor acceda al array para meter un carácter en el mismo momento en el que el consumidor está accediendo para consumir uno.

// Dado que el array es el recurso compartido al cual accederán los dos hilos, debemos sincronizar el acceso a través de un monitor (una clase), con dos métodos:
// synchronized: poner y sacar

public class Monitor {
    private char[] buff = null;
    private int tope = 0;
    private boolean lleno = false;
    private boolean vacio = true;

    public Monitor(int capacidad) {
        buff = new char[capacidad];
    }

    // Comenzamos con el método poner preguntando por el estado del buffer (array)
    // Si está lleno no hay nada que podamos hacer, por esto invocaremos al método wait para que el consumidor pueda consumir un carácter, y así desagotar el buffer.
    // Cuando retomamos la actividad, estaremos dentro del while. Si todo sigue igual volveremos a invocar wait. Así hasta que la variable lleno sea false.
    // En ese momento saldremos del while y ejecutaremos las líneas posteriores.
    // Estas líneas de código constituyen la sección crítica, pues son las que acceden a las variables compartidas entre ambos threads.
    // Al final ejecutamos notifyAll para pasar a ready a todos los hilos que están bloqueados por wait.
    public synchronized void poner(char c) throws Exception {
        // Mientras el buffer esté lleno nos bloqueamos para que el consumidor consuma algún carácter
        while (lleno) {
            wait(); 
        }

        // Sección crítica
        buff[tope++] = c;
        vacio = false;
        lleno = tope >= buff.length;
        notifyAll();
    }

    public synchronized char sacar() throws Exception {
        // Mientras el buffer esté vacío nos bloqueamos para que el productor pueda producir un carácter
        while (vacio) {
            wait(); 
        }

        // Sección crítica
        char c = buff[--tope];
        lleno = false;
        vacio = tope == 0;
        notifyAll();
        return c;
    }
}
