package Clase_9_4.AsociacionBidireccional;

import java.util.ArrayList;

public class Book {
    private String titulo;
    private ArrayList<Person> person =  new ArrayList<Person>();

    public Book(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    public void addPerson(Person owner) {
        if (!person.contains(owner)) {
            person.add(owner);
            owner.addBook(this); // Agrega este libro a la lista de libros poseídos por la persona
        }
    }
    public void showOwners(){
        System.out.println("Los dueños del libro " + this.titulo +  " son");
        for (Person own : this.person){
            System.out.println(own.getName());
        }
    }
}