package Parcial;

import java.util.ArrayList;

public class Campus {
    //atributos
    private int fase;
    private String date;
    private String hour;
    private ArrayList<Facility> facilities;

    //constructor
    public Campus(int fase, String date, String hour) {
        this.fase = fase;
        this.date = date;
        this.hour = hour;
        //el objeto se crea con el array, y un objeto instalacion
        facilities = new ArrayList<Facility>();
        facilities.add(new Facility("U18", "Cancha de basquetball", "Cancha Pedro", "deportiva"));
    }

    //getters y setters
    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public ArrayList<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(ArrayList<Facility> facilities) {
        this.facilities = facilities;
    }

    //añade instalaciones a la lista de instalaciones
    public void addFacility(Facility instalacion){
        facilities.add(instalacion);
    }
}
