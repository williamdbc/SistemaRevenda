package DOMINIO;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class RelacaoComercial {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_cli_forn;
    
    @Column (name = "nome_cli_forn", length = 50)
    private String nome_cli_forn;
    
    @Column (name = "cidade_cli_forn", length = 20)
    private String cidade_cli_forn;
    
}
