package Clase2.Ejercicio2;

public class SavingAccount extends Account{
    protected boolean able;

    public SavingAccount(float balance, float annualRate, boolean able) {
        super(balance, annualRate);
        if (this.balance < 10000){
            able = false;
        }else {
            able = true;
        }

    }

}
