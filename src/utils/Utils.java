package utils;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class Utils {

    public static void clearFields(JTextField fieldTitle, JTextField fieldContributor,JTextField fieldPublisher, JComboBox comboItemType,
                                   JSpinner spinnerPublicationYear, JSpinner spinnerNumberOfPages, JSpinner spinnerSupplierPrice) {
        fieldTitle.setText("");
        fieldPublisher.setText("");
        fieldContributor.setText("");
        
        comboItemType.setSelectedIndex(0);
        
        spinnerPublicationYear.setValue(2000);
        spinnerNumberOfPages.setValue(1);
        spinnerSupplierPrice.setValue(1);
        
    }
}
