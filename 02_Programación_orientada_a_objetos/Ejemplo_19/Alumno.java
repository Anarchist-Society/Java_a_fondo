public class Alumno {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Alumno(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    @Override
    public String toString() {
        return nombre + ", " + edad + ", " + notaPromedio;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public double getNotaPromedio() { return notaPromedio; }
    public void setNotaPromedio(double notaPromedio) { this.notaPromedio = notaPromedio; }
}
