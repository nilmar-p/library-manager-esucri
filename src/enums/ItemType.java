package enums;

public enum ItemType {
    REVISTA("REVISTA"),
    LIVRO("LIVRO"),
    QUADRINHOS("QUADRINHOS/MANGÁ"),
    CD("CD"),
    NONE("NENHUM");
    
    //
    private final String itemTypeDescription;

    //
    private ItemType(String itemTypeDescription) {
        this.itemTypeDescription = itemTypeDescription;
    }

    //
    @Override
    public String toString() {
        return itemTypeDescription;
    }
}
