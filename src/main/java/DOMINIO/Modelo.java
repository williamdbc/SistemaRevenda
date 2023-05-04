package DOMINIO;
import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Modelo implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_modelo;
    
    @Column (name="nome_modelo", length = 20)
    private String nome_modelo;
}
