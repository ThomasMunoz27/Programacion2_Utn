package Clase_9_4.Composicion;

public class Main {
    public static void main(String[] args) {
        Door d1 = new Door("Madera");
        Door d2 = new Door("Madera");
        Door d3 = new Door("Metal");
        Door d4 = new Door("Madera");
        House casa = new House(5);
        casa.addDoors(d1);


    }
}