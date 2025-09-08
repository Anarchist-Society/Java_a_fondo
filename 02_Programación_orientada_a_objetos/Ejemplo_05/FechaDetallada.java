package masclases;
import javaafondo.util.Fecha;

public class FechaDetallada extends Fecha  {
    private static String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    public FechaDetallada(int dia, int mes, int anio) {
        // Invocamos el constructor del padre
        super(dia, mes, anio);
    }

    public FechaDetallada() {
        // Invocamos el construcutor de tres enteros
        // pasandole una fecha por defecto
        this(1,1,1970);
    }

    public FechaDetallada(String f) {
        // Invocamos el constructor del padre
        super(f);
    }

    // public FechaDetallada() {
    //     // Invocamos el constructor del padre
    //     super();
    // }

    public String toString() {
        int m = getMes() - 1;
        return getDia() + " de " + meses[m] + " de " + getAnio();
    }
}
