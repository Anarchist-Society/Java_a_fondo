public final class TestEstatico {
    // Variable de instancia
    // Aunque la variable a es private, dentro del método main podemos acceder a ella, porque main también es parte de la clase TestEstatico, si no con getters y setters
    private int a = 0;

    // Método de instancia
    public void unMetodo() {
        System.out.println("Este es unMetodo()");
    }

    // Método de clase (estático)
    public static void main(String[] args) {
        TestEstatico te = new TestEstatico();
        // No tenemos acceso a la Variable a
        System.out.println("a vale " + te.a);

        // No teenemos acceso al método unMetodo
        te.unMetodo();

        // Podemos solucionar este problema haciendo que a y unMetodo sean estáticos; o bien, instanciar a TestEstatico dentro de main y usar dicha instancia
    }
}
