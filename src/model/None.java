package model;

public class None extends Item {

    private String contributor = "NENHUM";

    public None() {
        super();
    }

    @Override
    public String getContributor() {
        return contributor;
    }
}
