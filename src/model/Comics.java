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
        this.illustrator = illustrator;
    }

    //getters setters
    @Override
    public String getContributor() {
        return illustrator;
    }

    public void setContributor(String illustrator) {
        this.illustrator = illustrator;
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
