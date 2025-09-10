// 2.4.4. INTERFACE Comparable

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor
    public Alumno(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    /* En esta interface se declara un único método compareTo, cuya finalidad es comparar el objeto que recibe como parámetro (obj) con la propia instancia sobre la que
     * el método está siendo ejecutado (this).
     * Este método debe retorna un valor numérico entero, que será menor, igual, mayor que 0 según:
     * Si consideramos que this precede a obj, el valor debe retornar negativo
     * Si this sucede a obj, el valor debe retornar positivo
     * Si son iguales, debe retornar 0
     * */
    // Método heredado de la interface Complarable
    @Override
    public int compareTo(Alumno otroAlumno) {
        return this.edad - otroAlumno.edad;
    }

    @Override
    public String toString() {
        return nombre + ", " + edad + ", " + notaPromedio;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public double getNotaPromedio() { return notaPromedio; }
    public void setNotaPromedio(double notaPromedio) { this.notaPromedio = notaPromedio; }
}
