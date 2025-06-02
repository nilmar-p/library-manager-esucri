package model;

import enums.ItemType;

public final class Magazine extends Item {    //(revista não é literatura)

    private String coverFeature;

    public Magazine() {
        super();
    }

    public Magazine(String title, String publisher, int publicationYear, ItemType type, double supplierPrice, String coverFeature) {
        super(title, publisher, publicationYear, type, supplierPrice);
        this.setContributor(coverFeature);
    }

    //getters setters
    @Override
    public String getContributor() {
        return coverFeature;
    }

    public void setContributor(String coverFeature) {
        this.coverFeature = coverFeature;
    }

}
