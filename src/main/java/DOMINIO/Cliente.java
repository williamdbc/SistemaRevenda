package DOMINIO;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn (name = "id_cliente")
public class Cliente extends RelacaoComercial implements Serializable{
    
}
