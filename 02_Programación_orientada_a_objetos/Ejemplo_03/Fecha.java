public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha (int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    // La lógica para sumarle días a una fecha consistirá en convertirla a días
    // Agregarle la cantidad de días que le queremos sumar, y calcular a qué año, mes, día del mes
    // corresponde la cantidad de días resultante
    public void addDias(int n) {
        // 1º Pasamos todo a días:
        int dias = toDias();

        // Luego sumamos el número de días que queremos sumarle
        dias += n;

        // Lo pasamos a versión fecha
        toFecha(dias);
    }

    // La lógica para convertir una fecha en número de días:
    // Primero vamos a suponer que todos los meses tienen 30 días, por lo tanto según esto todos los años tiene 360 días
    // Restamos al mes - 1 para que no cuente el mes entero y se sume bien sus días
    // Por ejemplo: Fecha -> 15/3/2025
    // 2025 * 360 + 3 * 30 + 15 = 729105
    // Aquí ya estaríamos contando 3 meses completos (enero, febrero, marzo), pero todavía estamos dentro de marzo, así que estaríamos adelantados 1 mes
    // 2025 * 360 + (3 - 1) * 30 + 15 = 729075
    // Aquí contamos 2 meses completos (enero y febrero) + 15 días de marzo, que sí es correcto
    private int  toDias() {
        return anio * 360 + (mes - 1) * 30 + dia;
    }

    private void toFecha(int dias) {
        // Dividimos el número de días en total entre el número de días que tiene 1 año
        anio = dias / 360;
        // Sacamos el resto de dividirlo entre el número de días que tiene 1 año
        int resto = dias % 360;

        // Para calcular el mes, dividimos el resto de dividirlo entre el número de días que tiene 1 año entre 30 días que tiene 1 mes y sumamos 1
        mes = (resto / 30) + 1;

        // Por último para calcular el número de días, sacamos el resto de dividir el (dias % 360) % 30 -> Esto nos dará el número de días
        dia = resto % 30;
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(7, 9, 2025);
        System.out.println(fecha);
        fecha.addDias(365);
        System.out.println(fecha);
    }
}
