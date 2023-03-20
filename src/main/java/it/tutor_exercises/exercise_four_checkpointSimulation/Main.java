package it.tutor_exercises.exercise_four_checkpointSimulation;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("To Kill a Mockingbird", "Harper Lee", LocalDate.of(1960, 6, 11), 12.99, "A classic novel set in the Deep South during the Great Depression, which explores issues of race, justice, and morality through the eyes of a young girl named Scout.");
        Book b2 = new Book("Pride and Prejudice", "Jane Austen", LocalDate.of(1813, 1, 28), 12.99, "A classic romance novel set in Regency England, which satirizes social norms and gender roles while exploring themes of love, marriage, and class.");
        Book b3 = new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez", LocalDate.of(1967, 6, 11), 9.99, "A magical realist novel that chronicles the history of the Buendia family in the fictional town of Macondo, exploring themes of love, loss, and the cyclical nature of time.");
        Book b4 = new Book("Love in the Time of Cholera", "Gabriel Garcia Marquez", LocalDate.of(1985, 6, 11), 11.99, "A novel that tells the story of a long and tumultuous love affair between two people, exploring themes of passion, aging, and the power of memory.");
        Book b5 = new Book("Chronicle of a Death Foretold", "Gabriel Garcia Marquez", LocalDate.of(1981, 6, 11), 14.99, "A novella that investigates the murder of a young man in a small town in Colombia, exploring themes of honor, fate, and the nature of truth.");

        Library library = new Library("MyLibrary", "Via Maqeuda 20");
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        Book.compareBook(b1, b3);
        System.out.println("--------------------------------------");
        library.printAllBooks();

        System.out.println("--------------------------------------");
        library.addBook(b5);
        library.printAllBooks();

        System.out.println("--------------------------------------");
        System.out.println(library.findByNameOrAuthor("Gabriel Garcia Marquez"));

        System.out.println("--------------------------------------");
        System.out.println(library.getBookMap());
    }
}
