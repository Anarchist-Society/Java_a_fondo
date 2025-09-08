public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        super("Radio");
        this.radio = radio;
    }

    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Getters y setters
    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }
}
