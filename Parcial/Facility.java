package Parcial;

import java.util.ArrayList;

public class Facility {
    //atributos
    private String category;
    private String location;
    private String name;
    private String type;
    private ArrayList<Proof> pruebas;

    //constructor
    public Facility(String category, String location, String name, String type) {
        this.category = category;
        this.location = location;
        this.name = name;
        this.type = type;
        //el objeto se crea con el array
        pruebas = new ArrayList<Proof>();
    }

    //getters y setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    }

    public ArrayList<Proof> getPruebas() {
        return pruebas;
    }

    public void setPruebas(ArrayList<Proof> pruebas) {
        this.pruebas = pruebas;
    }

    //Añade pruebas a la lista de pruebas
    public void addProofs(Proof prueba){
        pruebas.add(prueba);
    }
}
