package RepasoParcial;

public class Main {
    public static void main(String[] args) {
        SuperMarket vea = new SuperMarket();
        vea.addProduct("Agua", 500);
        //vea.addProduct("");

        Client c1 = new Client("Thomas", "Muñoz");
       vea.shop(c1);
    }
}
