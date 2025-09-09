public class TestX {
    public static void main(String[] args) {
        // Es correcto decir que x1 y x2 son instancias de las clase X
        // Con el operador new gestionamos un espacio de memoria que hasta el momento no nos pertenecía
        X x1 = new X(5, 4);
        X x2 = new X(2, 7);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

    public static void prueba() {
        // Con el operador new gestionamos un espacio de memoria que hasta el momento no nos pertenecía
        X x1 = new X(10, 20);
        System.out.println(x1);
        // En este código, asignamos los valores 10 y 20 en las variables a y b, que se alojan en un espacio de memoria recién gestionado
        // y direccionado a través del objeto x1 de la clase X
        // Diremos que esta memoria fue gestionada dinámicamente, en otros lenguajes la memoria dinámica debe liberarse, para permitir que otros procesos la puedan tomar
        // En java no es necesario, porque existe un proceso llamado garbage collector, que controla los espacios de memoria que dejamos en desuso y los libera por nosotros

        // Ejemplo
        // Declaramos una variable p, de tipo X
        X p;
        // Gráficamente, p es un puntero que apunta a null (dirección de memoria nula), porque aún no le hemos asignado la dirección de ninguna instancia de X
        // p -> null 

        // Ahora, al objeto p le asignaremos una instancia de la clase X, haciendo que p contenga la dirección de memoria de esa instancia
        // que fue gestionada dinámicamente por el operador new
        p = new X(2,1);
        // p -> a: 2, b: 1

        // Ahora volvemos a instanciar a X y le asignamos a p la dirección de memoria de la nueva instancia
        p = new X(5,4);
        // p ahora tiene la dirección de memoria de la instnacia {5,4} y no existe ningún objeto o puntero de la antigua instancia {2,1}, decimos que ha sido desreferenciada
        // Por lo tanto el garbage collector es un proceso que se ocupa de buscar y liberar memoria desreferenciada
        // Antes de eliminar a un objeto desreferenciado, el garbage collector invocará sobre ese objeto el método finalize
        System.out.println(p);
    }
}
