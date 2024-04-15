package Clase_9_4.AsociacionUnidireccional;

public class Main {
    public static void main(String[] args) {
        Universidad u1 = new Universidad("Harvard");
        Alumno l1 = new Alumno("Thomas Muñoz", u1);
        l1.showUni();
    }
}
