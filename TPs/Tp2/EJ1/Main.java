package TPs.Tp2.EJ1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        PetShop ps1 = new PetShop(animals);

        Dog d1 = new Dog("Tufi", 13, "mamifero", 15000, "caniche", false);
        Bird b1 = new Bird("Blue", 2, "oviparos", 2500, "guacamayo", false);
        Cat c1 =  new Cat("Lucy", 5, "mamifero", 5000, "negro", true);
        ps1.addAnimal(b1);
        ps1.addAnimal(d1);
        ps1.addAnimal(c1);

        ps1.listAnimals();
        ps1.sellAnimal("Tufi");
        ps1.alimentarAnimal("Lucy");
    }
}
