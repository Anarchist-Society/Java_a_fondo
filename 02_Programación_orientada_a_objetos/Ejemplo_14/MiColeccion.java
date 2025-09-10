/* Desarrollaremos una clase que nos permita trabajar con un conjunto de objetos. Será una colección de objetos.
 * Funciones: agregar, insertar, obtener, eliminar y buscar dentro de un conjunto de objetos. Debe soportar una cantidad ilimitada de elementos.
 * Es decir, que el usuario, el programador que la utilce, podrá agregarle tantos objetos como quiera
 * */

public class MiColeccion {
    /* Aunque la longitud de los arrays en fija...
     * La lógica ses que mientras el array tenga espacio disponible, agregaremos los objetos en sus posiciones consecutivas
     * Cuando se llene crearemos un nuevo array cuya capacidad duplicará a la del anterior, y copiaremos uno a uno los elementos del viejo al nuevo
     * Al viejo le asignaremos null para que se lo lleve el garbage collector
     * */
    private static final int CAP_INIC = 10;

    // Declarado las variables de instancia datos y len, y un constructor, donde instanciamos el array
    private Object[] datos = null;
    private int len = 0;

    // Constructor
    public MiColeccion() {
        datos = new Object[CAP_INIC];
    }

    // Agrega un elemento al final de la colección 
    // El método  agregar, es añadir un elemento al final de la colleción
    // Se resuelve fácilmente invocando insertar, para que inserte el nuevo elemento en la posición len, que coincide con la primera posición libre del array
    public void agregar(Object elm) {
        insertar(elm, len);
    }

    // El método insertar inserta un elemento en la i-esima posición
    public void insertar(Object elm, int i) {
        // Si corresponde agrandamos el array
        verificarYAgrandar();

        // Desplaza los elementos hacia la derecha hasta la posición donde queremos insertar el objeto
        for (int j = len - 1; j >= i; j--) {
            datos[j + 1] = datos[j];
        }

        // Una vez la posición esté libre, podemos insertar el objeto
        datos[i] = elm;
        // Sumamos el contador de objetos guardados en el array
        len++;
    }

    // Como queremos que tenga una capacidad ilimitada, primero debemos verificar que el array datos tenga espacio disponible
    // De lo contrario lo tenemos que redimensionar
    private void verificarYAgrandar() {
        if (len == datos.length) {
            Object[] nuevo = new Object[datos.length * 2];

            for (int i = 0; i < datos.length; i++) {
                nuevo[i] = datos[i];
            }

            datos = nuevo;
            nuevo = null;
        }
    }

    // El método obtener retorna el i-esima elemento de la colección
    public Object obtener(int i) {
        return datos[i];
    }

    // Elimina y retorna el objeto en la i-esima posición
    // El método eliminar remueve el i-ésimo elemento del array desplazando hacia arriba los elementos ubicados a partir de la posición i + 1
    // Luego decrementa el valor de la variable len y retorna el elemento que fue removido de la colección
    public Object eliminar(int i) {
        Object aux = datos[i];

        for (int j = i; j < len - 1; j++) {
            datos[j] = datos[j + 1];
        }

        len--;
        return aux;
    }

    // Busca la primera ocurrencia del objeto especificado y
    // retorna la posición donde lo encuentra o un valor
    // negativo si no encontró lo que buscaba
    // El método buscar recorre el array hasta encontrar lo que busca, retorna la posición del elemento que encontró o un valor negativo en caso de no encontrarlo
    public int buscar(Object elm) {
        int i = 0;
        while (i < len && !datos[i].equals(elm)) {
            i++; 
        }

        return i < len ? i : -1;
    }

    // El método cantidad retorna la cantidad de elementos del conjunto
    public int cantidad() {
        return len;
    }

    /* Una vez llegado hasta aquí tenemos dos grandes problemas relacionadas con el hechode recibir y devolver objetos tipo Object.
     * No podemos conocer a priori cuál es el tipo de dato de sus elementos. Sabemos que son Object, pero no conocemos su verdadero tipo.
     * Estos métodos retornan instancias de MiColeccion, pero no sabemos cual es el tipo de dato de los objetos que contiene las colecciones que retornan.
     * El segundo problema está relacionado con el primero y surge cuando necesitamos acceder a alguno de los objetos de la colección.
     * Los métodos retorna Object así que necesitamos conocer cuál es el tipo de dato real del elemento al que accedemos para poder castear.
     * Este problema se resolvería haciendo que MiColeccion sea una clase genérica.
     * */
}
