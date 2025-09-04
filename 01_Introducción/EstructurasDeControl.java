import java.util.Scanner;

public class EstructurasDeControl {
    public static void main(String[] args) { Scanner sc = new Scanner(System.in); System.out.print("Ingrese su edad: "); int edad =  sc.nextInt();

        String mensaje = (edad > 18) ? "Bienvenido" : "Debe ser mayor de 18";
        System.out.println(mensaje);

        System.out.print("Número del día: ");
        int iDia = sc.nextInt();
        sc.nextLine();
        String sDia = "";

        switch (iDia) {
            case 1:
                sDia = "Lunes";
                break;
            case 2:
                sDia = "Martes";
                break;
            case 3:
                sDia = "Miércoles";
                break;
            case 4:
                sDia = "Jueves";
                break;
            case 5:
                sDia = "Viernes";
                break;
            case 6:
                sDia = "Sábado";
                break;
            case 7:
                sDia = "Domingo";
                break;
            default:
                sDia = "valor incorrecto";
                break;
        }

        System.out.println(iDia + " es: " + sDia);

        // También puede usarse con cadenas de caracteres
        System.out.print("Introduce el día: ");
        sDia = sc.nextLine();

        switch (sDia) {
            case "Lunes":
                iDia = 1;
                break;
            case "Martes":
                iDia = 2;
                break;
            case "Miércoles":
                iDia = 3;
                break;
            case "Jueves":
                iDia = 4;
                break;
            case "Viernes":
                iDia = 5;
                break;
            case "Sábado":
                iDia = 6;
                break;
            case "Domingo":
                iDia = 7;
                break;
            default:
                System.out.println("El día ingresado es incorrecto");
                break;
        }

        if (iDia != 0) {
            mensaje = sDia + " es el día " + iDia + " de la semana";
            System.out.println(mensaje);
        }

        sc.close();
    }
}
