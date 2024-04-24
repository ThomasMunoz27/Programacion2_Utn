package Clase_23_4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double num1, num2;
        System.out.println("Ingrese el primer número a operar");
        while (true){
            try {
                num1 = sc.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("Debe ingresar un número válido");
                sc.nextLine();
            }
        }

        System.out.println("Ingrese el segundo número a operar");
        while (true){
            try {
                num2 = sc.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("Debe ingresar un número válido");
                sc.nextLine();
            }
        }

        System.out.println("Ingrese operador aritmético (+, -, *, /)");

        String operator = sc.next();
        while (true){
            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")){
                System.out.println("Ingrese un operador válido");
                operator = sc.nextLine();
            }else {
                calculate(num1, num2,operator);
                break;
            }
        }


    }
    public static void calculate (double num1, double num2, String operation){
        Double result = null;
        switch (operation){
            case "+":
                result = num1+num2;
                break;
            case "-":
                result = num1-num2;
                break;
            case "*":
                result = num1*num2;
                break;
            case "/":
                try {
                    if (num2 == 0){
                        throw new ArithmeticException();
                    }
                    result =  num1/num2;
                }catch (ArithmeticException ae){
                    System.out.println("No se puede dividir por cero (0)");
                    result = null;
                }
                break;
            default:
                result = null;
        }

        if (result == null){
            System.out.println();
        }else {
            System.out.println("El resultado es: " + result);
        }
    }
}
