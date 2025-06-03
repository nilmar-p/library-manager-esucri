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
}
