package TPs.Tp3.Ej5;
import java.util.InputMismatchException;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //declaro valiarbles
        int option = 0;
        String desc;
        int prio;
        desc = sc.next();
        TaskList tl1 = new TaskList();

        //pregunta si ingresar tareas
        System.out.println("¿Desea ingresar tareas nuevas?\n Si(1)\n No(0)");
        while (true){
            try {
                option = sc.nextInt();
                if (option != 1 && option != 0){
                    throw new InputMismatchException();
                }
            }catch (InputMismatchException e){
                System.out.println("Debe ingresar una de las opciones");
                sc.next();
            }
            if (option == 0){
                System.out.println("Saliendo de la aplicación");
                System.exit(0);
            }
            while (true){
                System.out.println("Ingrese una descripcion para la tarea");
                desc = sc.next();
                if (desc.matches("\\d+")){
                    System.out.println("No debe ingresar números en la descripción");
                    sc.next();
                }
                break;
            }
            while (true){
                System.out.println("Asigne una prioridad a la tarea");
                try{
                    prio = sc.nextInt();
                    break;
                }catch (InputMismatchException me){
                    System.out.println("Ingrese un dato numérico");
                }

            }
            tl1.addTask(desc, prio);


            break;
        }



        tl1.showTasks();
        tl1.removeTask("Hacer de comer");
        tl1.showTasks();

    }
}
