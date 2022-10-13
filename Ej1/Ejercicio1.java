import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Buenas, "+ nombre);
        sc.close();
    }
}