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
        this.author = author;
    }

    // toString
    @Override
    public String toString() {
        return "Título: " + super.getTitle()
                + "\nEditora: " + super.getPublisher()
                + "\nGênero Literário: " + this.getGenre()
                + "\nNúmero de páginas: " + this.getNumberOfPages()
                + "\nData de publicação: " + super.getPublicationDate()
                + "\nTipo: " + super.getItemType()
                + "\nPreço do fornecedor: R$ " + String.format("%.2f", super.getSupplierPrice())
                + "\nPreço de venda: R$ " + String.format("%.2f", super.getSalePrice())
                + "\nLucro total: R$ " + String.format("%.2f", super.getProfit())
                + "\nMargem: " + String.format("%.1f", super.getProfitMargin() * 100) + "%";
    }
}
