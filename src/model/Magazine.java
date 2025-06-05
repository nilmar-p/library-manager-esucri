package model;

import enums.ItemType;

public final class Magazine extends Item {    //(revista não é literatura, n tem genero)

    private int numberOfPages;
    private String coverFeature;

    public Magazine() {
        super();
    }

    public Magazine(String title, String publisher, int publicationYear, ItemType type, double supplierPrice, String coverFeature, int NumberOfPages) {
        super(title, publisher, publicationYear, type, supplierPrice);
        this.setContributor(coverFeature);
        this.setNumberOfPages(NumberOfPages);
    }

    //getters setters
    @Override
    public String getContributor() {
        return coverFeature;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    //
    public void setContributor(String coverFeature) {
        this.coverFeature = coverFeature.trim().isEmpty() ? "SEM MANCHETE" : coverFeature.trim().toUpperCase();
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    //toString
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Manchete Principal: " + coverFeature;
    }
}
