import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public void addDias(int n) {
        // Instanciamos un calendar a partir de los atributos
        GregorianCalendar gc = new GregorianCalendar();
        gc.set(Calendar.YEAR, anio);
        gc.set(Calendar.MONTH, mes - 1);
        gc.set(Calendar.DAY_OF_MONTH, dia);

        // Le sumamos los días
        gc.add(Calendar.DAY_OF_MONTH, n);

        // Asignamos los nuevos datos en los atributos
        anio = gc.get(Calendar.YEAR);
        mes = gc.get(Calendar.MONTH) + 1;
        dia = gc.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(7, 9, 2025);
        fecha.addDias(365);
        System.out.println(fecha);
    }
}
