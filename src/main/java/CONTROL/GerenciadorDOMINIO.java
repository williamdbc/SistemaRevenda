package CONTROL;

import DAO.ConexaoHibernate;
import java.sql.SQLException;


public class GerenciadorDOMINIO {
    
    public GerenciadorDOMINIO() throws ClassNotFoundException, SQLException {
        ConexaoHibernate.getSessionFactory();
    }   
}
