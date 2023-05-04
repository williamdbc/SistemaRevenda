package DOMINIO;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn (name = "idCliente")
public class Cliente extends RelacaoComercial implements Serializable{
    
}
