package Parcial;

public class Person {
    //atributos
    private int dni;
    private String name;
    //constructor

    public Person(int dni, String name) {
        this.dni = dni;
        this.name = name;
    }

    //getters y setters
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
