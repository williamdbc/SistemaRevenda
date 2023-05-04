package DOMINIO;
import javax.persistence.*;

@Entity
public class Veiculo {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_veiculo;
    
    @Column (name = "combustivel", length = 20)
    private String combustivel;
    
    @Column (name = "cambio", length = 20) 
    private String cambio;
    
    @Column (name = "direcao", length = 20)
    private String direcao;
    
    @Column (name = "motor")
    private float motor;
    
    @Column (name = "airbag")
    private boolean airbag;
    
    @Column (name = "alarme")
    private boolean alarme;
    
    @Column (name = "freios_abs")
    private boolean freios_abs;
    
    @Column (name = "ar_condicionado")
    private boolean ar_condicionado;
    
    @Column (name = "vidro_eletrico")
    private boolean vidro_eletrico;
    
    @Column (name = "trava_eletrica")
    private boolean trava_eletrica;
}
