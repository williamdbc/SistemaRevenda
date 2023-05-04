package DOMINIO;
import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

public class Despesa implements Serializable {
    @Column (name = "nome_despesa", length = 50)
    private String nome_despesa;
    
    @Column (name="valor_despesa")
    private float valor_despesa;
    
    @Column (name="data_despesa") @Temporal (TemporalType.DATE)
    private Date data_despesa;
    
    @Column (name="responsavel", length = 30)
    private String responsavel;
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
    
    
}
