package model;

import enums.ItemType;
import enums.LiteraryGenre;

abstract class Literature extends Item {

    private int numberOfPages;
    private LiteraryGenre genre;

    public Literature() {
        super();
        this.setNumberOfPages(1);
        this.setGenre(LiteraryGenre.NONE);
    }

    public Literature(String title, String publisher, int publicationYear, ItemType type, double supplierPrice, int numberOfPages, LiteraryGenre genre) {
        super(title, publisher, publicationYear, type, supplierPrice);
        this.setNumberOfPages(numberOfPages);
        this.setGenre(genre);
    }

    // Getters
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public LiteraryGenre getGenre() {
        return genre;
    }

    // Setters
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setGenre(LiteraryGenre genre) {
        this.genre = genre;
    }

}
