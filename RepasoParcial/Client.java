package RepasoParcial;

import java.util.ArrayList;

public class Client {
    private String name;
    private String secondName;
    private ArrayList<Product> cart;

    public Client(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
        cart = new ArrayList<Product>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public void addProduct(Product item){
        if (item.getCantStock() <= 0){
            System.out.println("No hay stock de " + item.getName());
        }else {
            cart.add(item);
            item.setCantStock(item.getCantStock()-1);
        }
    }

    public void calcTotalProduct(){
        double total = 0;
        for (Product item: cart) {
            total += item.getPrice();
        }
        System.out.println("El precio de el total de productos de su carro es: $" + total);
    }
}
