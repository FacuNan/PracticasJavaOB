import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese precio");
        int precio = scanner.nextInt();
        System.out.println("Ingrese iva");
        double iva =scanner.nextDouble();

        double precioI = precioIva(precio, iva);

        System.out.println("Su precio total con iva es " + precioI);

        }
    public static double precioIva(int precio, double iva) {
return precio * iva;

    }
}
