public abstract class FiguraGeometrica {
    private String nombre;

    // Método abstracto
    public abstract double area(); // No tiene cuerpo

    public static double promedio(FiguraGeometrica[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].area();
        }
        return sum / arr.length;
    }


    // Agregamos un constructor
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return nombre + " (area = " + area() + ") ";
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
