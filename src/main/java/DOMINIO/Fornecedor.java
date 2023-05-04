package DOMINIO;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn (name = "id_fornecedor")
public class Fornecedor extends RelacaoComercial implements Serializable{

}
