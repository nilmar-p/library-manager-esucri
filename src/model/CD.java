package model;

import enums.ItemType;
import enums.MusicalGenre;

public class CD extends Item {

    private MusicalGenre genre;
    private String artist;

    //constructors
    public CD() {
        super();
        this.setGenre(MusicalGenre.NONE);
    }

    public CD(MusicalGenre genre, String title, String publisher, int publicationYear, ItemType type, double supplierPrice, String artist) {
        super(title, publisher, publicationYear, type, supplierPrice);
        this.setGenre(genre);
        this.setContributor(artist);
    }

    //getters and setters
    public MusicalGenre getGenre() {
        return genre;
    }

    @Override
    public String getContributor() {
        return artist;
    }

    public void setContributor(String artist) {
        this.artist = artist.trim().toUpperCase();
    }

    //
    public void setGenre(MusicalGenre genre) {
        this.genre = genre;
    }

    // toString
    @Override
    public String toString() {
        return "Título: " + super.getTitle()
                + "\nEditora: " + super.getPublisher()
                + "\nGênero Musical: " + this.getGenre()
                + "\nData de publicação: " + super.getPublicationDate()
                + "\nTipo: " + super.getItemType()
                + "\nPreço do fornecedor: R$ " + String.format("%.2f", super.getSupplierPrice())
                + "\nPreço de venda: R$ " + String.format("%.2f", super.getSalePrice())
                + "\nLucro total: R$ " + String.format("%.2f", super.getProfit())
                + "\nMargem: " + String.format("%.1f", super.getProfitMargin() * 100) + "%";
    }

}
