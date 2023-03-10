package it.tutor_exercises.exercise_four_checkpointSimulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private String name;
    private String address;
    private ArrayList<Book> booksList;

    public Library(String name, String address){
        this.name = name;
        this.address = address;
        booksList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Book> getBooksList() {
        return this.booksList;
    }

    public void setBooksList(ArrayList<Book> booksList) {
        this.booksList = booksList;
    }

    public ArrayList<Book> findByNameOrAuthor(String stringToFind){
        ArrayList<Book> finalBookList = new ArrayList<>();
        for(Book b : booksList){
            if(b.getName().equals(stringToFind) || b.getAuthor().equals(stringToFind)){
                finalBookList.add(b);
            }
        }
        return finalBookList;
    }

    public void printAllBooks(){
        for(Book b : booksList){
            b.printInfo();
            System.out.println();
        }
    }

    public void addBook(Book b){
        booksList.add(b);
    }

    public Map<String, ArrayList<Book>> getBookMap(){
        Map<String, ArrayList<Book>> finalMap = new HashMap<>();
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for(Book b : booksList){
            if (finalMap.containsKey(b.getAuthor())) {
                booksByAuthor = finalMap.get(b.getAuthor());
            }
            booksByAuthor.add(b);
            finalMap.put(b.getAuthor(), booksByAuthor);
            booksByAuthor = new ArrayList<>();
        }
        return finalMap;
    }
}
