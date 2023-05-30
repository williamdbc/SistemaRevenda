package DOMINIO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Versao {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_versao;
    
    @Column (name = "nome_versao", length = 30)
    private String nome_versao;
    
    @ManyToOne (fetch = FetchType.EAGER) @JoinColumn (name = "id_modelo")
    private Modelo modelo;
    
    @OneToMany (mappedBy = "versao", fetch = FetchType.EAGER) //nao tinha nada no fetch
    private List<Veiculo> veiculos = new ArrayList();
        
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */

    public int getId_versao() {
        return id_versao;
    }

    public void setId_versao(int id_versao) {
        this.id_versao = id_versao;
    }

    public String getNome_versao() {
        return nome_versao;
    }

    public void setNome_versao(String nome_versao) {
        this.nome_versao = nome_versao;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
     
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */

    public Versao() {
    }

    public Versao(Modelo modelo, String nome_versao) {
        this.nome_versao = nome_versao;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return nome_versao;
    }
   
    public Object[] toArray(){
        return new Object[] {id_versao, modelo.getMarca().getNome_marca(), modelo.getNome_modelo(), nome_versao};
    }
    
}
