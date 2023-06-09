package DOMINIO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Modelo implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_modelo;
    
    @Column (name="nome_modelo", length = 20)
    private String nome_modelo;
    
    @ManyToOne(fetch = FetchType.EAGER) @JoinColumn(name = "id_marca")
    private Marca marca;
    
    @OneToMany (mappedBy = "modelo", fetch = FetchType.EAGER, cascade = CascadeType.ALL)    //Era Lazy
    private List<Versao> versoes = new ArrayList();
    
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */

    public int getId_modelo() {
        return id_modelo;
    }

    public void setId_modelo(int id_modelo) {
        this.id_modelo = id_modelo;
    }

    public String getNome_modelo() {
        return nome_modelo;
    }

    public void setNome_modelo(String nome_modelo) {
        this.nome_modelo = nome_modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public List<Versao> getVersoes() {
        return versoes;
    }
     
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */

    public Modelo() {
    }

    public Modelo(Marca marca, String nome_modelo) {
        this.marca = marca;
        this.nome_modelo = nome_modelo;
    }

    @Override
    public String toString() {
        return nome_modelo;
    }
    
    public Object[] toArray(){
        return new Object[] {id_modelo, marca.getNome_marca(), this};
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Modelo other = (Modelo) obj;
        return id_modelo == other.id_modelo;
    }
}
