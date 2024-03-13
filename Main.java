import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        boolean again = true;
        String operation;
        while (true){
         System.out.println("Ingrese la operación a realizar: \n 1) Suma. \n 2) Resta. \n 3) Multiplicación. \n 4) División \n");
         operation = sc.next();
         operation.toLowerCase();
         if (operation.equals("suma")){
             System.out.println(suma());
         }


        break;//todavia no hago la salida
        }

    }

    public static double suma(){
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.println("Ingrese el primer número:");
        num1 = sc.nextDouble();
        System.out.println(num1);
        return num1;
    }

}
