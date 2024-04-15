package Clase2.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CurrentAccount ca1 = new CurrentAccount(1000, 50);
        SavingAccount sa1 = new SavingAccount(22000,10);

        sa1.consign(2000);
        sa1.withdraw(5000);
        sa1.consign(2000);
        sa1.withdraw(5000);
        sa1.consign(2000);
        sa1.withdraw(5000);
        sa1.monthlyStatement();
        sa1.print();
    }
}
