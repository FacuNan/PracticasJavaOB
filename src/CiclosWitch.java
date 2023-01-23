import java.util.Scanner;

public class CiclosWitch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el dia por favor...");

        String dia = scanner.nextLine();
        switch (dia.toLowerCase()){
            case "lunes":
                System.out.println("Buen Lunes amigo/a");
                break;
            case "martes":
                System.out.println("Buen Martes amigo/a");

            case "miercoles":
                System.out.println("Buen Miercoles amigo/a");

            case "jueves":
                System.out.println("Buen Jueves amigo/a");

            case "viernes":
                System.out.println("Buen viernes amigo/a");

            case "sabado":
                System.out.println("Buen sabado amigo/a");

            case "domingo":
                System.out.println("Buen domingo amigo/a");

            default:
                System.out.println("El dia no es valido");


        }







    }
}
