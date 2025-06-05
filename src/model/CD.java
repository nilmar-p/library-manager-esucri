package model;

import enums.ItemType;
import enums.MusicalGenre;

public class CD extends Item {

    private MusicalGenre genre;
    private String artist;
    private int numberOfTracks;

    //constructors
    public CD() {
        super();
        this.setGenre(MusicalGenre.NONE);
    }

    public CD(MusicalGenre genre, String title, String publisher, int publicationYear, ItemType type, double supplierPrice, String artist, int numberOfTracks) {
        super(title, publisher, publicationYear, type, supplierPrice);
        this.setGenre(genre);
        this.setContributor(artist);
        this.setNumberOfTracks(numberOfTracks);
    }

    //getters and setters
    public MusicalGenre getGenre() {
        return genre;
    }

    @Override
    public String getContributor() {
        return artist;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    //
    public void setContributor(String artist) {
        this.artist = artist.trim().isEmpty() ? "SEM ARTISTA" : artist.trim().toUpperCase();
    }

    public void setGenre(MusicalGenre genre) {
        this.genre = genre;
    }

    public void setNumberOfTracks(int numberOfTracks) {
        this.numberOfTracks = numberOfTracks;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Nome do artista: " + artist;
    }
}
