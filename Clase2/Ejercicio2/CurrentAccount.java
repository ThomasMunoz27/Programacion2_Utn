package Clase2.Ejercicio2;

public class CurrentAccount extends Account{
    protected float overdraft = 0;

    public CurrentAccount(float balance, float annualRate, float overdraft) {
        super(balance, annualRate);
        this.overdraft = overdraft;
    }
}
