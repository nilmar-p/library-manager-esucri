package model;

import enums.ItemType;
import enums.LiteraryGenre;

public class Book extends Literature {

    private String author;

    //constructors
    public Book() {
        super();
        super.setNumberOfPages(1);
        super.setGenre(LiteraryGenre.NONE);
    }

    public Book(String title, String publisher, int publicationYear, ItemType type, double supplierPrice, int numberOfPages, LiteraryGenre genre, String author) {
        super(title, publisher, publicationYear, type, supplierPrice, numberOfPages, genre);
        super.setNumberOfPages(numberOfPages);
        super.setGenre(genre);
        this.setContributor(author);
    }

    //getters and setters
    @Override
    public String getContributor() {
        return author;
    }

    public void setContributor(String author) {
        this.author = author.trim().toUpperCase();
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Nome do autor: " + author;
    }
}
