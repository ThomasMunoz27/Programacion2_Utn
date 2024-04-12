package TPs.Tp2;

import java.util.ArrayList;

public class PetShop {
    private ArrayList<Animal> Animals;

    public PetShop(ArrayList<Animal> animals) {
        Animals = animals;
    }

    public void addAnimal(Animal animal) {
        Animals.add(animal);
        System.out.println("El animal " + animal.getName() + " fue añadido a la tienda.");
    }

    public void sellAnimal(String name) {
        Animal a1 = buscarAnimal(name);
        if (a1 != null) {
            System.out.println(a1.getName() + " Fue vendido por: " + a1.getPrice());
            Animals.remove(a1);
        }else{
            System.out.println("Ese animal no existe");
        }

    }


    public void alimentarAnimal(String name){
        Animal a1 = buscarAnimal(name);
            if (a1 !=null){
                a1.feed(name);
            }else {
                System.out.println("Ese animal no existe");
        }
    }
    public void listAnimals(){
        for(int i = 0; i < Animals.size(); i++){
            Animal a1  = Animals.get(i);
            System.out.println(a1.toString());
        }
    }

    public Animal buscarAnimal(String nombre) {
        for (Animal animal : Animals) {
            if (animal.getName().equals(nombre)) {
                return animal;
            }
        }
        return null;
    }
}
