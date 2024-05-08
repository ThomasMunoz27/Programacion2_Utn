package RepasoParcial;

import java.util.ArrayList;

public class SuperMarket {
    //atributos
    private ArrayList<Product> inventory;

    //constructor
    public SuperMarket() {
        inventory = new ArrayList<Product>();
        inventory.add(new Product("Aceite", 5000));
    }

    //getters y setters
    public ArrayList<Product> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Product> inventory) {
        this.inventory = inventory;
    }

            //metodos

    //añade productos a la lista de produ
    public void addProduct(String name, double price){
        inventory.add(new Product(name, price));
    }
    public void searchProduct(String title){
        for (Product item: inventory) {
            if (item.getName().equals(title)){
                System.out.println("Producto encontrado");
            }else {
                System.out.println("Producto no encontrado");
            }
        }
    }
    public void showInvetory(){
        for (Product item: inventory) {
            item.showInfo();
            System.out.println("\n");
        }
    }

    public void shop(Client person){
        System.out.println("Bienvenido al supermercado. Este es nuestro inventario");
        showInvetory();
        person.addProduct(inventory.get(0));
        person.addProduct(inventory.get(0));
        person.addProduct(inventory.get(0));

        person.calcTotalProduct();
    }
}
