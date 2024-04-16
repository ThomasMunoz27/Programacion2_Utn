package Clase_16_04.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        ArrayList<Integer> ej1 = new ArrayList<Integer>(Arrays.asList(100,2,3,4,5,6,7,8,9,10));
        int bigger = Collections.max(ej1);
        int indexBiggger = ej1.indexOf(bigger);
        System.out.println("El indice del número mayor es: " + indexBiggger);

        //Ejercicio 2
        //usando el array anterior
        int lowest = Collections.min(ej1);
        int indexLowest = ej1.indexOf(lowest);
        System.out.println("El indice del número menor es: " + indexLowest);

        //Ejercicio 3
        HashSet<Integer> ej3 = new HashSet<>(10);
    }
}
