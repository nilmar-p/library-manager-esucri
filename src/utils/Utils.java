package utils;

import enums.ItemType;
import static enums.ItemType.CD;
import forms.MenuScreen;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import model.Book;
import model.CD;
import model.Comics;
import model.Item;
import model.Magazine;

public class Utils {

    public static void clearFields(JTextField fieldTitle, JTextField fieldContributor, JTextField fieldPublisher, JComboBox comboItemType,
            JSpinner spinnerPublicationYear, JSpinner spinnerNumberOfPages, JSpinner spinnerSupplierPrice) {
        fieldTitle.setText("");
        fieldPublisher.setText("");
        fieldContributor.setText("");

        comboItemType.setSelectedIndex(0);

        spinnerPublicationYear.setValue(2000);
        spinnerNumberOfPages.setValue(1);
        spinnerSupplierPrice.setValue(1);

    }

    public static Object[] createObjectToTable(Item item) {
        ItemType type = item.getItemType();

        switch (type) {
            case LIVRO:
                Book book = (Book) item;
                return new Object[]{
                    book.getId(),
                    book.getTitle(),
                    book.getPublisher(),
                    book.getGenre(),
                    book.getNumberOfPages(),
                    book.getContributor(),
                    book.getPublicationDate(),
                    book.getItemType(),
                    String.format("R$ %.2f", book.getSupplierPrice()),
                    String.format("%.0f%%", book.getProfitMargin() * 100),
                    String.format("R$ %.2f", book.getSalePrice()),
                    String.format("R$ %.2f", book.getProfit()),};

            case REVISTA:
                Magazine magazine = (Magazine) item;
                return new Object[]{
                    magazine.getId(),
                    magazine.getTitle(),
                    magazine.getPublisher(),
                    magazine.getItemType(),
                    magazine.getNumberOfPages(),
                    magazine.getContributor(),
                    magazine.getPublicationDate(),
                    magazine.getItemType(),
                    String.format("R$ %.2f", magazine.getSupplierPrice()),
                    String.format("%.0f%%", magazine.getProfitMargin() * 100),
                    String.format("R$ %.2f", magazine.getSalePrice()),
                    String.format("R$ %.2f", magazine.getProfit()),};

            case QUADRINHOS:
                Comics comics = (Comics) item;
                return new Object[]{
                    comics.getId(),
                    comics.getTitle(),
                    comics.getPublisher(),
                    comics.getGenre(),
                    comics.getNumberOfPages(),
                    comics.getContributor(),
                    comics.getPublicationDate(),
                    comics.getItemType(),
                    String.format("R$ %.2f", comics.getSupplierPrice()),
                    String.format("%.0f%%", comics.getProfitMargin() * 100),
                    String.format("R$ %.2f", comics.getSalePrice()),
                    String.format("R$ %.2f", comics.getProfit()),};

            case CD:
                CD cd = (CD) item;
                return new Object[]{
                    cd.getId(),
                    cd.getTitle(),
                    cd.getPublisher(),
                    cd.getGenre(),
                    cd.getNumberOfTracks(),
                    cd.getContributor(),
                    cd.getPublicationDate(),
                    cd.getItemType(),
                    String.format("R$ %.2f", cd.getSupplierPrice()),
                    String.format("%.0f%%", cd.getProfitMargin() * 100),
                    String.format("R$ %.2f", cd.getSalePrice()),
                    String.format("R$ %.2f", cd.getProfit()),};

            case NONE:
            default:
                return new Object[]{
                    item.getId(),
                    item.getTitle(),
                    "NENHUM",
                    "NENHUM",
                    "NENHUM",
                    "NENHUM",
                    "NENHUM",
                    "NENHUM",
                    String.format("R$ %.2f", item.getSupplierPrice()),
                    String.format("%.0f%%", item.getProfitMargin() * 100),
                    String.format("R$ %.2f", item.getSalePrice()),
                    String.format("R$ %.2f", item.getProfit())
                };
        }
    }

    public static void loadItemsOnTable(JTable tableRegistereds) {
        DefaultTableModel tableModel = (DefaultTableModel) tableRegistereds.getModel();

        tableModel.setRowCount(0);

        for (Item item : MenuScreen.getRegisteredItems()) {
            tableModel.addRow(createObjectToTable(item));
        }
    }

    public static void searchItemsOnTable(JTable tableRegistereds, String filter, String search) {
        if (search.isEmpty()) {
            loadItemsOnTable(tableRegistereds);
            return;
        }

        DefaultTableModel tableModel = (DefaultTableModel) tableRegistereds.getModel();

        tableModel.setRowCount(0);

        switch (filter) {
            case "TITULO" -> {
                for (Item item : MenuScreen.getRegisteredItems()) {
                    if (item.getTitle().startsWith(search)) {
                        tableModel.addRow(createObjectToTable(item));
                    }
                }
            }

            case "EDITORA" -> {
                for (Item item : MenuScreen.getRegisteredItems()) {
                    if (item.getPublisher().startsWith(search)) {
                        tableModel.addRow(createObjectToTable(item));
                    }
                }
            }

            case "AUTOR" -> {
                for (Item item : MenuScreen.getRegisteredItems()) {
                    if (item.getContributor().startsWith(search)) {
                        tableModel.addRow(createObjectToTable(item));
                    }
                }
            }

            default -> {
                JOptionPane.showMessageDialog(null, "ERRO NA PESQUISA");
            }
        }

    }
}
