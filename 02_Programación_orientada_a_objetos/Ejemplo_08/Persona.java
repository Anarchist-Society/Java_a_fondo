// Los atributos de las clases son variables de instancia, pero no necesariamente las variables de instancia serán atributos

public class Persona {
    // Persona solo tiene cuatro variables de instancia: nombre, dni, fechaNacimiento, cont
    // Pero solo las primeras tres son atributos
    // La variable cont es utilizada para contar cuántas veces se ha invocado el método toString sobre el objeto q
    //
    private String nombre;
    private String dni;
    private Fecha fechaNacimiento;
    private int cont = 0;

    public Persona(String nombre, String dni, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString() {
        cont++;
        String ret = "";
        ret += nombre + ", ";
        ret += "DNI: " + dni + " ";
        ret += "nacido el: " + fechaNacimiento + " ";
        ret += "(" + cont + ")";
        return ret;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public Fecha getFechaNacimiento() {return fechaNacimiento; }
    public void setFechaNacimiento(Fecha fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public int getCont() { return cont; }
    public void setCount(int cont) { this.cont = cont; }
}
