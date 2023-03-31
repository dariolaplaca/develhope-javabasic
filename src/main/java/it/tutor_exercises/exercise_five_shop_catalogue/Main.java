package it.tutor_exercises.exercise_five_shop_catalogue;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Item book1 = new Item("A song of ice and fire", 12.99, ProductType.BOOK);
        Item book2 = new Item("Harry Potter", 16.99, ProductType.BOOK);


        Item magazine1 = new Item("National Geographic", 3.99, ProductType.MAGAZINE);
        Item magazine2 = new Item("Time", 1.99, ProductType.MAGAZINE);
        Item magazine3 = new Item("Wired", 2.99, ProductType.MAGAZINE);

        Item newspaper1 = new Item("The New York Times", 0.99, ProductType.NEWSPAPER);
        Item newspaper2 = new Item("The Guardian", 1.99, ProductType.NEWSPAPER);

        Shop myShop = new Shop("My Shop");
        myShop.loadCatalog();

//        myShop.addItem(book1);
//        myShop.addItem(book2);
//        myShop.addItem(book1);
//        myShop.addItem(book1);
//        myShop.addItem(magazine1);
//        myShop.addItem(magazine2);
//        myShop.addItem(magazine3);
//        myShop.addItem(newspaper1);
//        myShop.addItem(newspaper2);
//        myShop.saveCatalog();

        myShop.printCatalogue();


    }
}
