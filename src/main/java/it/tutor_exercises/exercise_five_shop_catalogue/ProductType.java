package it.tutor_exercises.exercise_five_shop_catalogue;

public enum ProductType {
    BOOK("Book", "It's a book"),
    MAGAZINE("Magazine", "It's a magazine"),
    NEWSPAPER("Newspaper", "It's a newspaper");

    final String name;
    final String description;

    ProductType(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }
}
