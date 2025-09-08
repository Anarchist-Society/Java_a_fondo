public class Test {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(4);
        Rectangulo rectangulo = new Rectangulo(10, 5);
        Triangulo triangulo = new Triangulo(3, 6);

        System.out.println(circulo);
        System.out.println(rectangulo);
        System.out.println(triangulo);

        FiguraGeometrica[] arr = {new Circulo(23), new Rectangulo(12, 4), new Triangulo(2, 5)};
        double promedio = FiguraGeometrica.promedio(arr);
        System.out.println("Promedio = " + promedio);
    }
}
