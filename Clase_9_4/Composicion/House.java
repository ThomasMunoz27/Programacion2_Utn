package Clase_9_4.Composicion;
import java.util.ArrayList;

public class House {
    private ArrayList<Door> doors;
    private int cantDors;

    public House(int cantDors) {
        this.cantDors = cantDors;
        doors= new ArrayList<Door>(cantDors);
    }

    public void printDoors() {
        System.out.println("Los materiales de las" + cantDors + " son: ");
        for (int i = 0; i < doors.size(); i++) {
            System.out.println(doors.get(i));

        }
    }
    public void addDoors(Door material){
        doors.add(material);
    }

}