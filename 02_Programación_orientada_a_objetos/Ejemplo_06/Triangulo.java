public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super("Triángulo");
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return base * altura / 2;
    }

    // Getters y setters
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }
}
