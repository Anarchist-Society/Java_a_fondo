package masclases;
import javaafondo.util.Fecha;

public class FechaDetallada extends Fecha  {
    public FechaDetallada() {}

    public FechaDetallada(String f) {
        super(f);
    }

    private static String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};

    public String toString() {
        int m = getMes() - 1;
        return getDia() + " de " + meses[m] + " de " + getAnio();
    }
}
