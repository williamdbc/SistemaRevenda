package DOMINIO;
import CONTROL.FuncoesUteis;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Despesa implements Serializable {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_despesa;
    
    @Column (name = "nome_despesa", length = 50)
    private String nome_despesa;
    
    @Column (name="valor_despesa")
    private float valor_despesa;
    
    @Column (name="data_despesa") @Temporal (TemporalType.DATE)
    private Date data_despesa;
    
    @Column (name="responsavel", length = 30)
    private String responsavel;
    
    @ManyToOne (fetch = FetchType.EAGER) @JoinColumn (name = "id_revenda")
    private Revenda revenda;
    
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
    
    public String getNome_despesa() {
        return nome_despesa;
    }

    public void setNome_despesa(String nome_despesa) {
        this.nome_despesa = nome_despesa;
    }

    public float getValor_despesa() {
        return valor_despesa;
    }

    public void setValor_despesa(float valor_despesa) {
        this.valor_despesa = valor_despesa;
    }

    public Date getData_despesa() {
        return data_despesa;
    }

    public void setData_despesa(Date data_despesa) {
        this.data_despesa = data_despesa;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */

    public Despesa() {
    }

    public Despesa(Revenda revenda, String nome_despesa, float valor_despesa, Date data_despesa, String responsavel) {
        this.nome_despesa = nome_despesa;
        this.valor_despesa = valor_despesa;
        this.data_despesa = data_despesa;
        this.responsavel = responsavel;
        this.revenda = revenda;
    }
    
    public Object[] toArray(){
        return new Object[] {this, valor_despesa, FuncoesUteis.dateToString(data_despesa), responsavel};
    }

    @Override
    public String toString() {
        return nome_despesa;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Despesa other = (Despesa) obj;
        return id_despesa == other.id_despesa;
    }
    
    
    
}
