package CONTROL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class FuncoesUteis {
    
    public static String dateToString(Date dataSQL){                                 //Converte uma data de string para SQL
        return new SimpleDateFormat("dd/MM/yyyy").format(dataSQL);
    }
 
    public static Date stringToDate(String dataString) throws ParseException{       //Converte uma data de SQL para String
        return new SimpleDateFormat("dd/MM/yyyy").parse(dataString);
    }
    
    public static String stringToStringSQL(String dataString) throws ParseException{ //Converte uma String para String no formato SQL. Ex: 03/06/2023 > 2023/06/03
        return new SimpleDateFormat("yyyy/MM/dd").format(stringToDate(dataString));
    }
    
    public static void cleanTextFields(JTextField[] listaTextFields){
        for(JTextField txt : listaTextFields){
            txt.setText("");
        }
    }
    
    public static void cleanComboBoxs(JComboBox[] listaComboBoxs){
         for(JComboBox cmb : listaComboBoxs){
            cmb.setSelectedIndex(-1);
        }
    }
    
    public static void cleanCheckBoxs(JCheckBox[] listaComboBoxs){
         for(JCheckBox chk : listaComboBoxs){
            chk.setSelected(false);
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
    
    
    public static void ordenarTabela(JTable tabela, int coluna, SortOrder tipoOrdem){
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabela.getModel());
        
        if(coluna == 0){
            sorter.setComparator(coluna, (valor_id_1, valor_id_2) -> {
            Integer id_1 = Integer.parseInt(valor_id_1.toString());
            Integer id_2 = Integer.parseInt(valor_id_2.toString());
            return id_1.compareTo(id_2);
            });
        }
        
        tabela.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(coluna, tipoOrdem));
        sorter.setSortKeys(sortKeys);
    }
    
    public static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }
    
    public static boolean isFloat(String str) {
        return str != null && str.matches("^\\s*\\d+(\\.\\d+)?\\s*$");
    }   
    
    public static boolean isData(String str) {
        return str != null && str.matches("\\d{2}/\\d{2}/\\d{4}");
    }

}
