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
    
    @Column (name = "telefone_cli_forn", length = 20)
    private String telefone_cli_forn;

/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */

    public int getId_cli_forn() {
        return id_cli_forn;
    }

    public void setId_cli_forn(int id_cli_forn) {
        this.id_cli_forn = id_cli_forn;
    }

    public String getNome_cli_forn() {
        return nome_cli_forn;
    }

    public void setNome_cli_forn(String nome_cli_forn) {
        this.nome_cli_forn = nome_cli_forn;
    }

    public String getCidade_cli_forn() {
        return cidade_cli_forn;
    }

    public void setCidade_cli_forn(String cidade_cli_forn) {
        this.cidade_cli_forn = cidade_cli_forn;
    }

    public String getTelefone_cli_forn() {
        return telefone_cli_forn;
    }

    public void setTelefone_cli_forn(String telefone_cli_forn) {
        this.telefone_cli_forn = telefone_cli_forn;
    }
    
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */

    public RelacaoComercial() {
    }

    public RelacaoComercial(String nome_cli_forn, String cidade_cli_forn, String telefone_cli_forn) {
        this.nome_cli_forn = nome_cli_forn;
        this.cidade_cli_forn = cidade_cli_forn;
        this.telefone_cli_forn = telefone_cli_forn;
    }
    
    @Override
    public String toString() {
        return getNome_cli_forn();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        RelacaoComercial other = (RelacaoComercial) obj;
        return id_cli_forn == other.id_cli_forn;
    }
 
}
