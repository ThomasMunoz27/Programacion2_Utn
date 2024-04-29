package TPs.TP4.Ej1part2;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int target = ThreadLocalRandom.current().nextInt(0, 100 + 1);


        int op;
        int cont = 0;
        System.out.println("Bienvenido a ADiVINaTRoN, el juego se basa en adivinar el numero aleatorio elegido por el programa en el menor numero de intentos posible.");
        while (true){
            System.out.println("Ingresa un numero entre 1 y 100: ");
            try{
                op = sc.nextInt();
                if (op < 1 || op > 100) {
                    System.out.println("El número ingresado está fuera del rango. Debe ser entre 1 y 100.");
                    continue; // Volver al inicio del bucle
                }
                cont++;
            }catch (InputMismatchException e){
                System.err.println("Error de entrada. (Debes ingresar un numero entero entre 1 y 100)");
                sc.next();
                continue;
            }

            if (op == target){
                System.out.println("Ganaste despues de: " + cont + " intentos.");
                break;
            }else if(op < target){
                System.out.println("El numero ingresado es menor que el objetivo");


            }else{
                System.out.println("El numero ingresado es mayor que el objetivo");

            }


        }

    }
}


