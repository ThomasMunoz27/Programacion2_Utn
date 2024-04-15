package Clase_9_4.AsociacionBidireccional;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            book.addPerson(this); // Agrega esta persona como poseedora del libro
        }
    }

    public void showBooks(){
        if (books.size()==0){
            System.out.println(name + " no tiene libros");
        }else{
            System.out.println("Los libros que posee " + name + " son ");
            for (Book autoBooks : books){
                System.out.println(autoBooks.getTitulo());
            }
        }
    }

}
