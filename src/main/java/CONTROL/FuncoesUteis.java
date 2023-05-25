
package CONTROL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class FuncoesUteis {
    
    private static String dateToString(Date dataSQL){
        return new SimpleDateFormat("dd/MM/yyyy").format(dataSQL);
    }
 
    private static Date stringToDate(String dataString) throws ParseException{
        return new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
    }
    
    private void limparComboText(JComboBox[] listaCombos, JTextField[] listaTextos){
        for(JComboBox combo : listaCombos){
            combo.setSelectedIndex(-1);
        }
        
        for(JTextField textField : listaTextos){
            textField.setText("");
        }
    }
    
}
