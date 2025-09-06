public class Fecha {
    // "private": significa que no se podrá acceder desde fuera de la clase. Están encapsulados, y acceder a ellos solo es posible dentro de la clase
    private int dia;
    private int mes;
    private int anio;

    // Constructor nulo
    public Fecha() {
    }

    // Constructor parametrizado
    public Fecha(int d, int m, int a) {
        dia = d;
        mes = m;
        anio = a;
    }

    // También se podría usar los métodos setters para poder cambiar los valores
    // public Fecha (int d, int m, int a) {
    //     dia = setDia(d);
    //     mes = setMes(m);
    //     anio = setAnio(a);
    // }

    // Sobreescribimos el método toString
    @Override
    public String toString() {
        // Retornamos la representación que queremos
        return dia + "/" + mes + "/" + anio;
    }

    @Override
    public boolean equals(Object o) {
        Fecha otraFecha = (Fecha)o;
        return (dia == otraFecha.dia)
            && (mes ==otraFecha.mes)
            && (anio == otraFecha.anio);
    }

    // Como son privados, para poder interactuar con ellos necesitamos estos métodos de clase, son conocidos como getters ys setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; };
    public int getAnio() { return anio; }
    public void setAnio( int anio) { this.anio = anio; }
    
    public static void main(String[] args) {
    }

    public static void usamosObjetos() {
        // Creamos una fecha y le asignamos valores a sus atributos
        Fecha f = new Fecha();
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);

        System.out.println("Día: " + f.getDia());
        System.out.println("Mes: " + f.getMes());
        System.out.println("Anio: " + f.getAnio());
        // En esta línea estamos impriendo todo el objeto
        System.out.println(f); // La salida será algo así: Fecha@251a69d7
        // Esto ocurre porque System.out.println() no sabe cómo mostrar los objetos de esta clase. Para solucionarlo debemos sobrescribir el método toString, que lo heredamos de la clase Object

        Fecha f1 = new Fecha();
        f1.setDia(2);
        f1.setMes(10);
        f1.setAnio(1970);

        Fecha f2 = new Fecha();
        f2.setDia(2);
        f2.setMes(10);
        f2.setAnio(1970);

        if (f1.equals(f2)) {
            System.out.println("Son iguales :0");
        }
    }

    public static void declararCrearObjetos() {
        // Declaramos un objeto tipo fecha
        Fecha f; // El objeto f que acabamos de declarar no está listo para ser usado, porque solo fue declarado, no fue creado (instanciado)
        f = new Fecha(); // Con esto ya lo hemos instanciado
        f.setDia(2);
        f.setMes(10);
        f.setAnio(1970);
    }

    public static void constructores() {
        Fecha f = new Fecha(2,10,1970);
        System.out.println(f);
    }
}
