package DOMINIO;
import java.io.Serializable;
import javax.persistence.*;

@Entity 
@PrimaryKeyJoinColumn (name = "id_fornecedor")
public class Fornecedor extends RelacaoComercial implements Serializable{

    public Fornecedor() {
    }

    public Fornecedor(String nome_cli_forn, String cidade_cli_forn, String telefone_cli_forn) {
        super(nome_cli_forn, cidade_cli_forn, telefone_cli_forn);
    }

    public Object[] toArray(){
        return new Object[] {getId_cli_forn(), getNome_cli_forn(), getCidade_cli_forn(), getTelefone_cli_forn()};
    }
}
