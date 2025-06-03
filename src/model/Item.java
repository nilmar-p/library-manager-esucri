package model;

import enums.ItemType;
import forms.MenuScreen;
import java.util.concurrent.ThreadLocalRandom;

abstract public class Item {

    private int id;

    private String title;
    private String publisher;
    private int publicationYear;

    private ItemType type;

    private double supplierPrice;
    private double profitMargin;

    private double salePrice;
    private double profit;

    //getters and setter
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public abstract String getContributor();

    public int getPublicationDate() {
        return publicationYear;
    }

    public ItemType getItemType() {
        return type;
    }

    public double getSupplierPrice() {
        return supplierPrice;
    }

    public double getProfit() {
        return profit;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getProfitMargin() {
        return profitMargin;
    }

    //
    private void setId() {
        int newId;
        boolean idExists;
        do {
            newId = ThreadLocalRandom.current().nextInt(1000, 9999);
            idExists = false;
            for (Item item : MenuScreen.getRegisteredItems()) {
                if (item.getId() == newId) {
                    idExists = true;
                    break;
                }
            }
        } while (idExists);
        this.id = newId;
    }

    public void setTitle(String title) {
        this.title = title.trim().isEmpty() ? "SEM TÍTULO" : title.trim().toUpperCase();
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher.trim().isEmpty() ? "SEM PUBLISHER" : publisher.trim().toUpperCase();
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setItemType(ItemType type) {
        this.type = type;
    }

    public void setSupplierPrice(double supplierPrice) {
        this.supplierPrice = supplierPrice < 0 ? 0 : supplierPrice;
        setSalePrice();
        setProfit();
    }

    public void setProfitMargin(ItemType type) {
        switch (type) {
            case REVISTA:
                this.profitMargin = ProfitRules.getMagazineMargin();
                break;
            case LIVRO:
                this.profitMargin = ProfitRules.getBookMargin();
                break;
            case QUADRINHOS:
                this.profitMargin = ProfitRules.getComicsMargin();
                break;
            case CD:
                this.profitMargin = ProfitRules.getCdMargin();
                break;
            case NONE:
                this.profitMargin = ProfitRules.getNoneMargin();
                break;
            default:
                throw new AssertionError();
        }

        setSalePrice();
        setProfit();
    }

    private void setSalePrice() {
        this.salePrice = this.supplierPrice * (profitMargin + 1);
    }

    private void setProfit() {
        this.profit = this.salePrice - this.supplierPrice;
    }

    //constructor
    public Item() {
        this.setTitle("SEM TÍTULO");
        this.setPublisher("SEM EDITORA");
        this.setPublicationYear(0);
        this.setItemType(ItemType.NONE);
        this.setSupplierPrice(0);
        this.setProfitMargin(ItemType.NONE);

        this.setId();

        this.setSalePrice();
        this.setProfit();
    }

    public Item(String title, String publisher, int publicationYear, ItemType type, double supplierPrice) {
        this.setTitle(title);
        this.setPublisher(publisher);
        this.setPublicationYear(publicationYear);
        this.setItemType(type);
        this.setSupplierPrice(supplierPrice);
        this.setProfitMargin(type);

        this.setId();

        this.setSalePrice();
        this.setProfit();
    }

    //toString
    @Override
    public String toString() {
        return "Título: " + title
                + "\nEditora: " + publisher
                + "\nData de publicação: " + publicationYear
                + "\nTipo: " + type
                + "\nPreço do fornecedor: R$ " + String.format("%.2f", supplierPrice);
    }
}
