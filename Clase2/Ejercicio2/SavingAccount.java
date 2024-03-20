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
    public boolean isAble() {
        return able;
    }

    public void consign(int dep){
        if (able == true){
            this.balance -= dep;
            System.out.println("Se han consignado $" + dep);
        }else {
            System.out.println("No fue posible consignar, debido a que su cuenta está inactiva");
        }

    }

}
