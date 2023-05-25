package DOMINIO;
import java.util.ArrayList;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.transaction.Transactional;

@Entity
@Transactional
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
    
    @Column (name="valor_venda")
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

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }
    
    
    
    
    
    
    
    
    
    
    public Revenda() {
    }
   
    public Revenda(Veiculo veiculo, Fornecedor fornecedor, String placa, String cor, int quilometragem, Date data_compra, float valor_compra) {
        this.placa = placa;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.data_compra = data_compra;
        this.valor_compra = valor_compra;
        this.veiculo = veiculo;
        this.fornecedor = fornecedor;
    }
    
    public Revenda(Cliente cliente, Date data_venda, float valor_venda) {
        this.data_compra = data_compra;
        this.valor_compra = valor_compra;
        this.cliente = cliente;
    }
    
    public Object[] toArray_Compra(){
        return new Object[] {veiculo.getVersao().getModelo().getMarca().getNome_marca() + " " +
                            veiculo.getVersao().getModelo().getNome_modelo() + " " +
                            veiculo.getVersao().getNome_versao(),
                            veiculo.getAno(), cor, quilometragem, fornecedor.getNome_cli_forn(), this, valor_compra, data_compra};
    }
    
    public Object[] toArray_Venda(){
        return new Object[] {veiculo.getVersao().getModelo().getMarca().getNome_marca() + " " +
                            veiculo.getVersao().getModelo().getNome_modelo() + " " +
                            veiculo.getVersao().getNome_versao(),
                            veiculo.getAno(), cor, this, fornecedor.getNome_cli_forn(), valor_compra, data_compra, 0, valor_venda, data_venda, valor_venda - valor_compra};
    }

    @Override
    public String toString() {
        return placa; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
    
}
