package TPs.TP4.Ej3;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double base, high;

        while (true){
            System.out.println("Ingrese la base del Triángulo");
            try {
                base = sc.nextDouble();
                break;
            }catch (InputMismatchException ie){
                System.out.println("Ingrese un valor válido");
                sc.nextLine();
            }
        }
        while (true){
            System.out.println("Ingrese la altura del Triángulo");
            try {
                high = sc.nextDouble();
                break;
            }catch (InputMismatchException ie){
                System.out.println("Ingrese un valor válido");
                sc.nextLine();
            }
        }
        System.out.println("El área del triángulo es: " + calculateArea(base, high));


    }
    public static double calculateArea(double b,double h){
        double result = 0;

        result = (b*h)/2;

        return result;
    }
}
