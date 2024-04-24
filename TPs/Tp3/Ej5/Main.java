package TPs.Tp3.Ej5;

public class Main {
    public static void main(String[] args) {

        TaskList tl1 = new TaskList();
        tl1.addTask("Hacer de comer", 3);
        tl1.addTask("Limpiar el baño", 2);
        tl1.addTask("Ir a la facultad", 5);
        tl1.addTask("Llevar a la abuela al hospital", 10);

        tl1.showTasks();
        tl1.removeTask("Hacer de comer");
        tl1.showTasks();

    }
}
