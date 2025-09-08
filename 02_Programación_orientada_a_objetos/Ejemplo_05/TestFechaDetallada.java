package masclases;
import javaafondo.util.Fecha;
import masclases.FechaDetallada;

public class TestFechaDetallada {
    public static void main(String[] args) {
        FechaDetallada fd = new FechaDetallada();
        fd.setDia(8);
        fd.setMes(9);
        fd.setAnio(2025);
        System.out.println(fd);

        Fecha fec = new FechaDetallada("25/02/2017");
        Object obj = new FechaDetallada("3/12/2018");
    
        System.out.println("fec = " + fec);
        System.out.println("obj = " + obj);
    }
}
