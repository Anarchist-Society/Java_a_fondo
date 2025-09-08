public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        // Constructor del padre
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    // Getters y setters
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
}
