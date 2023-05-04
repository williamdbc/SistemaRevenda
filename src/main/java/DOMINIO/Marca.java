package DOMINIO;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Marca implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_marca;
    
    @Column (name = "nome_marca", length = 15)
    private String nome_marca;
}
