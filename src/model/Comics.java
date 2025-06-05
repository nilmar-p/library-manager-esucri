package model;

import enums.ItemType;
import enums.LiteraryGenre;

public class Comics extends Literature {

    private String illustrator;

    //constructors
    public Comics(String illustrator) {
        this.illustrator = illustrator;
    }

    public Comics(String title, String publisher, int publicationYear, ItemType type, double supplierPrice, int numberOfPages, LiteraryGenre genre, String illustrator) {
        super(title, publisher, publicationYear, type, supplierPrice, numberOfPages, genre);
        this.setContributor(illustrator);
    }

    //getters setters
    @Override
    public String getContributor() {
        return illustrator;
    }

    public void setContributor(String illustrator) {
        this.illustrator = illustrator.trim().isEmpty() ? "SEM ILUSTRADOR" : illustrator.trim().toUpperCase();
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Nome do Ilustrador: " + illustrator;
    }
}
