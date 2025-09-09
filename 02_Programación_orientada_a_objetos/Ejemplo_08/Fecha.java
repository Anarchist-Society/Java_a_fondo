import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    // Constructor parametrizado
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }


    // Constructor parametrizado
    public Fecha(String s) {
        int p1 = s.indexOf("/");
        int p2 = s.lastIndexOf("/");
        dia = Integer.parseInt(s.substring(0, p1));
        mes = Integer.parseInt(s.substring(p1 + 1, p2));
        anio = Integer.parseInt(s.substring(p2 + 1));
    }

    // Constructor nulo
    public Fecha() {}

    public int getDia() { return dia; }
    public void setDia(int d) { dia = d; }
    public int getMes() { return mes; }
    public void setMes(int m) { mes = m; }
    public int getAnio() { return anio; }
    public void setAnio(int a) { anio = a; }

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
}
