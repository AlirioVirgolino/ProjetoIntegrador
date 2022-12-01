import java.io.Serializable;

public class AnamneseGeral implements Serializable {
    private Integer id;
    private String queixaPrincipal;
    private String historicoMedico;
    private String alimentacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getContactantes() {
        return contactantes;
    }

    public void setContactantes(String contactantes) {
        this.contactantes = contactantes;
    }

    public String getVacinacao() {
        return vacinacao;
    }

    public void setVacinacao(String vacinacao) {
        this.vacinacao = vacinacao;
    }

    public String getVermifugacao() {
        return vermifugacao;
    }

    public void setVermifugacao(String vermifugacao) {
        this.vermifugacao = vermifugacao;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    private String contactantes;
    private String vacinacao;
    private String vermifugacao;
    private String ambiente;

    @Override
    public String toString() {
        return super.toString();
    }
}
