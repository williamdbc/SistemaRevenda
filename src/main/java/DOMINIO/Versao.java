package DOMINIO;
import javax.persistence.*;

@Entity
public class Versao {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_versao;
    
    @Column (name = "nome_versao", length = 30)
    private String nome_versao;
    
}
