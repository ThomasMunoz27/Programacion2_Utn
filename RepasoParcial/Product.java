package RepasoParcial;

public class Product {
    private String name;
    private double price;
    private int cantStock;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        cantStock = 2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCantStock() {
        return cantStock;
    }

    public void setCantStock(int cantStock) {
        this.cantStock = cantStock;
    }

    public void showInfo(){
        System.out.println(name + ": $" + price + "\nCantidad en stock: " + cantStock);
    }
}
