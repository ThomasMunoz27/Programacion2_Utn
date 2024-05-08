package Parcial;

import java.util.ArrayList;

public class EquipoNacional {
    //atributos
    private String color;
    private String country;
    private ArrayList<Athlete> team;
    //constructor

    public EquipoNacional(String color, String country) {
        this.color = color;
        this.country = country;
        team =  new ArrayList<Athlete>();
    }

    //getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Athlete> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<Athlete> team) {
        this.team = team;
    }


    //añade atletas a la lista de atletas
    public void addAtlhete(Athlete member){
        team.add(member);
    }

}
