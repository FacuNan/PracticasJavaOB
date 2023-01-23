import java.util.Scanner;

public class Condiciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Que hora es? Porfavor ingresa un numero de dos digitos...");

        int hora = scanner.nextInt();

        if (hora > 12 && hora > 20){
            System.out.println("Buenas tardes");
        }else if(hora <= 12){
            System.out.println("Buenos dias ");
        }else{
            System.out.println("Buenas noches");
        }
    }
}
