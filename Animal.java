import java.io.Serializable;

public class Animal implements Serializable {
    private Integer id;
    private String nome;
    private String especie;
    private String raca;
    private String sexo;
    private Integer idade;
    private Float peso;
    private String pelagem;
    private String procedencia;
    private AnamneseGeral anamneseGeral;
    private AnamneseEspecial anamneseEspecial;
    private ExameFisico exameFisico;
    private Tutor tutor;

    public Animal (){
        this.tutor = new Tutor();
        this.anamneseEspecial = new AnamneseEspecial();
        this.anamneseGeral = new AnamneseGeral();
        this.exameFisico = new ExameFisico();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public AnamneseGeral getAnamneseGeral() {
        return anamneseGeral;
    }

    public void setAnamneseGeral(AnamneseGeral anamneseGeral) {
        this.anamneseGeral = anamneseGeral;
    }

    public AnamneseEspecial getAnamneseEspecial() {
        return anamneseEspecial;
    }

    public void setAnamneseEspecial(AnamneseEspecial anamneseEspecial) {
        this.anamneseEspecial = anamneseEspecial;
    }

    public ExameFisico getExameFisico() {
        return exameFisico;
    }

    public void setExameFisico(ExameFisico exameFisico) {
        this.exameFisico = exameFisico;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", pelagem='" + pelagem + '\'' +
                ", procedencia='" + procedencia + '\'' +
                ", anamneseGeral=" + anamneseGeral +
                ", anamneseEspecial=" + anamneseEspecial +
                ", exameFisico=" + exameFisico +
                ", tutor=" + tutor +
                '}';
    }
}
