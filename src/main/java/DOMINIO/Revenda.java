package DOMINIO;
import javax.persistence.*;
import java.util.Date;

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
    
}
