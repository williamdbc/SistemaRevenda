package DOMINIO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Veiculo {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id_veiculo;
    
    @Column (name = "ano")
    private int ano;
    
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
    
    @ManyToOne (fetch = FetchType.EAGER) @JoinColumn (name = "id_versao")
    private Versao versao;
    
    @OneToMany (mappedBy = "veiculo", fetch = FetchType.LAZY)
    private List<Revenda> revendas = new ArrayList();
   
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */

    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean isAlarme() {
        return alarme;
    }

    public void setAlarme(boolean alarme) {
        this.alarme = alarme;
    }

    public boolean isFreios_abs() {
        return freios_abs;
    }

    public void setFreios_abs(boolean freios_abs) {
        this.freios_abs = freios_abs;
    }

    public boolean isAr_condicionado() {
        return ar_condicionado;
    }

    public void setAr_condicionado(boolean ar_condicionado) {
        this.ar_condicionado = ar_condicionado;
    }

    public boolean isVidro_eletrico() {
        return vidro_eletrico;
    }

    public void setVidro_eletrico(boolean vidro_eletrico) {
        this.vidro_eletrico = vidro_eletrico;
    }

    public boolean isTrava_eletrica() {
        return trava_eletrica;
    }

    public void setTrava_eletrica(boolean trava_eletrica) {
        this.trava_eletrica = trava_eletrica;
    }

    public Versao getVersao() {
        return versao;
    }

/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
/* ----------------------------------------------------------------------------------------------------------------------- */
    
    public Veiculo() {
    }

    public Veiculo(Versao versao, int ano, String combustivel, String cambio, String direcao, float motor, boolean airbag, boolean alarme, 
                    boolean ar_condicionado, boolean freios_abs, boolean trava_eletrica, boolean vidro_eletrico){
        this.ano = ano;
        this.combustivel = combustivel;
        this.cambio = cambio;
        this.direcao = direcao;
        this.motor = motor;
        this.airbag = airbag;
        this.alarme = alarme;
        this.freios_abs = freios_abs;
        this.ar_condicionado = ar_condicionado;
        this.vidro_eletrico = vidro_eletrico;
        this.trava_eletrica = trava_eletrica;
        this.versao = versao;
    }

    @Override
    public String toString() {
        return String.valueOf(ano);
    }
    
    public Object[] toArray(){
    return new Object[] {id_veiculo, versao.getModelo().getMarca().getNome_marca(), 
                        versao.getModelo().getNome_modelo(),
                        versao.getNome_versao(),
                        this, combustivel, cambio, direcao, motor};
    }
    
}
