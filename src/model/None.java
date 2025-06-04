package model;

public class None extends Item {

    private String contributor = "NENHUM";

    public None() {
        super();
    }

    public None(String title, double supplierPrice) {
        super.setTitle(title);
        super.setSupplierPrice(supplierPrice);
    }

    @Override
    public String getContributor() {
        return contributor;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Nome do autor: " + contributor;
    }
}
