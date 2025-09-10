// Las clases genéricas permiten parametrizar los tipos de datos de sus variables de instancia, los tipos de sus parámetros y el valor de retorno de sus métodos
 
public class MiColeccion<T> {
    private static final int LONGITUD_INICIAL = 10;
    private T[] datos = null;
    private int cantidadElementos = 0;


    // Constructor
    public MiColeccion() {
        // Necesitamos castear de Object[] a T[]
        datos = (T[]) new Object[LONGITUD_INICIAL];
    }

    public void agregar(T elemento) {
        insertar(elemento, cantidadElementos);
    }

    public void insertar(T elemento, int posicion) {
        verificarYAgrandar();

        for (int i = cantidadElementos - 1; i >= posicion ; i--) {
            datos[i + 1] =  datos[i];
        }

        datos[posicion] = elemento;
        cantidadElementos++; 
    }

    public void verificarYAgrandar() {
        if (cantidadElementos == datos.length) {
            T[] datosNuevo = (T[]) new Object[datos.length * 2];

            for (int i = 0; i < cantidadElementos; i++) {
                datosNuevo[i] = datos[i];
            }

            datos = datosNuevo;
            datosNuevo = null;
        }
    }

    public T obtener(int posicion) {
        return datos[posicion];
    }

    public T eliminar(int posicion) {
        T elementoEliminado = datos[posicion];

        for (int i = posicion; i < cantidadElementos - 1; i++) {
            datos[i] = datos[i + 1];
        }

        cantidadElementos--;
        return elementoEliminado;
    }

    public int buscar(T objeto) {
        int i = 0;
        while (i < cantidadElementos && !datos[i].equals(objeto)) {
            i++; 
        }
        return (i < cantidadElementos) ? i : -1;
    }

    public int cantidad() {
        return cantidadElementos;
    }
}
