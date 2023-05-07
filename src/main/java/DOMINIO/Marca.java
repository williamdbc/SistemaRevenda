package DOMINIO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Marca implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_marca;
    
    @Column (name = "nome_marca", length = 15)
    private String nome_marca;
    
    @OneToMany(mappedBy = "marca", fetch = FetchType.LAZY)
    private List<Modelo> modelos = new ArrayList();
    
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */

    public int getId_marca() {
        return id_marca;
    }

    public void setId_marca(int id_marca) {
        this.id_marca = id_marca;
    }

    public String getNome_marca() {
        return nome_marca;
    }

    public void setNome_marca(String nome_marca) {
        this.nome_marca = nome_marca;
    }
    
    
}
