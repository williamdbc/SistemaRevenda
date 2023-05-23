package DOMINIO;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn (name = "id_cliente")
public class Cliente extends RelacaoComercial implements Serializable{

    public Cliente() {
    }
    
    public Cliente(String nome_cli_forn, String cidade_cli_forn, String telefone_cli_forn) {
        super(nome_cli_forn, cidade_cli_forn, telefone_cli_forn);
    }

    public Object[] toArray(){
        return new Object[] {getId_cli_forn(), getNome_cli_forn(), getCidade_cli_forn(), getTelefone_cli_forn()};
    }
    
}
