// 3.2.2. REFERENCIAS A METODOS
// En java no existe el concepto de puntero a función como sí hay en C o Pascal, los método estáticos pueden usarse para implementar interfaces funcionales.
// Es decir, una interface funcional puede contener la referencia a un método estático, por lo cual una variable del tipo de la interface se comportaría como un puntero a función.

// Declaramos una interface funcional llamada MiFuncion, cuyo único método es: invocar
public interface MiFuncion {
    public String invocar(int v);

    // Ahora dos métodos estáticos cuyos prototipos concuerdan con el prototipo del método invocar:String.valueOf e Integer.toBinaryString. Ambos esperan recibir un valor tipo int y retornan un valor tipo String.
    // String valueOf(int);
    // String toBinaryString(int);
}
