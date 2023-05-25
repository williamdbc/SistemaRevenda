
package CONTROL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FuncoesUteis {
    
    public static String dateToString(Date dataSQL){
        return new SimpleDateFormat("dd/MM/yyyy").format(dataSQL);
    }
 
    public static Date stringToDate(String dataString) throws ParseException{
        return new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
    }
    
    public static void limparComboText(JComboBox[] listaCombos, JTextField[] listaTextos){
        for(JComboBox combo : listaCombos){
            combo.setSelectedIndex(-1);
        }
        
        for(JTextField textField : listaTextos){
            textField.setText("");
        }
    }
    
    public static void isEditando(boolean editando, JButton botao1, JButton botao2, JButton botao3, JLabel label){
        if(editando){
            botao1.setVisible(false);
            botao2.setVisible(true);
            botao3.setVisible(true);
            label.setVisible(true);   
        } else {
            botao1.setVisible(true);
            botao2.setVisible(false);
            botao3.setVisible(false);
            label.setVisible(false);     
        }
    }
    
}
