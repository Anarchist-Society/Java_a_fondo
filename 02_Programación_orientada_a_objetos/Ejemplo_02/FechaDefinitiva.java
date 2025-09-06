import java.util.Scanner;

public class FechaDefinitiva {
    private int dia;
    private int mes;
    private int anio;

    // Constructor nulo
    public FechaDefinitiva() {}

    // Constructor parametrizado
    public FechaDefinitiva(int d, int m, int a) {
        dia = d;
        mes = m;
        anio = a;
    }

    // Ahora voy a hacer que la clase FechaDefinitiva permita crear objetos a partir de una cadena de caracteres.
    public FechaDefinitiva(String s) {
        // Buscamos la primera ocurrencia de '/'
        int p1 = s.indexOf("/");

        // Buscamos la última ocurrencia de '/'
        int p2 = s.lastIndexOf("/");
        dia = Integer.parseInt(s.substring(0, p1));
        mes = Integer.parseInt(s.substring(p1 + 1, p2));
        anio = Integer.parseInt(s.substring(p2 + 1));
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    @Override
    public boolean equals(Object o) {
        FechaDefinitiva otra = (FechaDefinitiva)o;
        return (dia == otra.dia)
            && mes == otra.mes
            && anio == otra.anio;
    }

    public int getDia() { return dia; }
    public void setDia(int d) { dia = d; }
    public int getMes() { return mes; }
    public void setMes(int m) { mes = m; }
    public int getAnio() { return anio; }
    public void setAnio(int a) { anio = a; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // El usuario ingresa los datos de una fecha
        System.out.print("Ingresa Fecha1 (dia, mes y anio): ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();

        // Instanciamos un objeto de la clase fecha
        FechaDefinitiva f1 = new FechaDefinitiva(dia, mes, anio);

        System.out.print("Ingresa Fecha2 (dia, mes y anio): ");
        dia = sc.nextInt();
        mes = sc.nextInt();
        anio = sc.nextInt();

        // Instanciamos otro objeto de la clase Fecha
        FechaDefinitiva f2 = new FechaDefinitiva(dia, mes, anio);

        if (f1.equals(f2)) {
            System.out.println("Son iguales !");
        } else {
            System.out.println("Son distintas...");
        }

        // Ahora que hemos sobrecargado el constructor con uno nulo y parametrizado podemos hacer esto:
        FechaDefinitiva f3 = new FechaDefinitiva();
        f3.setDia(11);
        f3.setMes(9);
        f3.setAnio(2001);


        // Creamos una fecha a partir sus atributos
        FechaDefinitiva f4 = new FechaDefinitiva("11/09/2001");
        System.out.println(f4);

        if (f3.equals(f4)) {
            System.out.println("Las fechas son iguales !");
        }
        sc.close();
    }
}
