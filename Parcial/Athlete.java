package Parcial;

public class Athlete extends Person implements Contract {
    //atributos
    private double height;
    private int age;
    private double weight;
    //constructor

    public Athlete(int dni, String name, double height, int age, double weight) {
        super(dni, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    //getters y setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Calcula el Indice de masa corporal. Devuelve un double
    @Override
    public double calcIMC() {
        return weight / (Math.pow(height, 2));
    }

    //mide si el atleta tiene o no sobrepeso. devuelve un booleano
    @Override
    public boolean overweight(double imc) {
        if (imc >= 25) {
            return true;
        } else {
            return false;
        }
    }

    //toma el puslo del atleta)
    @Override
    public double takePulses() {
        return 78;
    }
}
