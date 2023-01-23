import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese precio");
        int precio = scanner.nextInt();
        System.out.println("Ingrese iva");
        double iva = scanner.nextDouble();

        double precioI = precioConIva(precio, iva);


        System.out.println("Su precio con iva es  " + precioI);

    }

    public static double calcularIva(int precio, double iva) {
        return precio * iva;
    }

    public static double precioConIva(int precio, double iva){
        double ivaCalculado = calcularIva(precio, iva);
        return precio + ivaCalculado;
        


    }






}
