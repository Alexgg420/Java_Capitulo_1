import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca su dirección: ");
        System.out.println("Calle: ");
        String calle = sc.nextLine();
        System.out.println("Portal: ");
        String portal = sc.nextLine();
        System.out.println("Número: ");
        String num = sc.nextLine();
        System.out.println("Introduzca su número de teléfono: ");
        String numt = sc.nextLine();
        System.out.println("Buenas, "+nombre);
        System.out.println("Ud. vive en calle "+calle+", portal "+portal+", número  "+ num+".");
        System.out.println("Su número de teléfono es: "+numt+".");
        sc.close();
    }
}