package DOMINIO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
public class Marca implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_marca;
    
    @Column (name = "nome_marca", length = 15)
    private String nome_marca;
    
    
    @OneToMany(mappedBy = "marca", fetch = FetchType.EAGER) //era LAZY
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

    public List<Modelo> getModelos() {
        return modelos;
    }
    
    public List<Modelo> teste(){
        return modelos;
    }
    
    
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
    
    public Marca(){      
    }
    
    public Marca(String nome_marca) {
        this.nome_marca = nome_marca;
    }

    @Override
    public String toString() {
        return nome_marca;
    }
    
    public Object[] toArray(){
        return new Object[] {id_marca, nome_marca};
    }
    
    
}
