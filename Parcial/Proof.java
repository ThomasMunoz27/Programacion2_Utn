package Parcial;

import java.util.ArrayList;

public class Proof {
    //atributos
    private int code;
    private String title;

    private ArrayList<Athlete> participants;

    private Campus sede;
    //constructor

    public Proof(int code, String title) {
        this.code = code;
        this.title = title;
        //el objeto se crea con el array, y un objeto atleta
        participants = new ArrayList<Athlete>();
        participants.add(new Athlete(94219667, "Thomas Muñoz", 1.70, 19, 74.25));
    }

    //getters y setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Athlete> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Athlete> participants) {
        this.participants = participants;
    }

    public Campus getSede() {
        return sede;
    }

    public void setSede(Campus sede) {
        this.sede = sede;
    }

    //añade atletas a la lista de participantes de la prueba
    public void addParticipant(Athlete participant){
        participants.add(participant);
    }
}
