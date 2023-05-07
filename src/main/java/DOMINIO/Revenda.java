package DOMINIO;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Revenda {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_revenda;
    
    @Column (name="placa", length = 8)
    private String placa;
    
    @Column (name = "cor", length = 15)
    private String cor;
    
    @Column (name="quilometragem")
    private int quilometragem;
    
    @Column (name="data_compra") @Temporal (TemporalType.DATE)
    private Date data_compra;
    
    @Column (name="valor_compra")
    private float valor_compra;
    
    @Column (name="data_venda") @Temporal (TemporalType.DATE)
    private Date data_venda;
    
    @Column (name="valor_vemda")
    private float valor_venda;
    
    @ManyToOne (fetch = FetchType.EAGER) @JoinColumn (name = "id_veiculo")
    private Veiculo veiculo;
    
    @ManyToOne (fetch = FetchType.EAGER) @JoinColumn (name = "id_cliente")
    private Cliente cliente;
    
    @ManyToOne (fetch = FetchType.EAGER) @JoinColumn (name = "id_fornecedor")
    private Fornecedor fornecedor;
    
    @OneToMany (mappedBy = "revenda", fetch = FetchType.LAZY)
    private List<Despesa> despesas = new ArrayList();
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */

    public int getId_revenda() {
        return id_revenda;
    }

    public void setId_revenda(int id_revenda) {
        this.id_revenda = id_revenda;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }

    public float getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(float valor_compra) {
        this.valor_compra = valor_compra;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public float getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(float valor_venda) {
        this.valor_venda = valor_venda;
    }
    
    
}
