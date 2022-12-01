import java.io.Serializable;

public class ExameFisico implements Serializable {

        private String postura;
        private String nivelDeConsciencia;
        private String escoreCorporal;
        private Float tr;
        private Integer fr;
        private Integer fc;
        private Integer tpc;
        private Integer pulso;
        private String hidratacao;
        private String linfonodosSubmandibular;
        private String linfonodosPreEscapulares;

        public String getPostura() {
                return postura;
        }

        public void setPostura(String postura) {
                this.postura = postura;
        }

        public String getNivelDeConsciencia() {
                return nivelDeConsciencia;
        }

        public void setNivelDeConsciencia(String nivelDeConsciencia) {
                this.nivelDeConsciencia = nivelDeConsciencia;
        }

        public String getEscoreCorporal() {
                return escoreCorporal;
        }

        public void setEscoreCorporal(String escoreCorporal) {
                this.escoreCorporal = escoreCorporal;
        }

        public Float getTr() {
                return tr;
        }

        public void setTr(Float tr) {
                this.tr = tr;
        }

        public Integer getFr() {
                return fr;
        }

        public void setFr(Integer fr) {
                this.fr = fr;
        }

        public Integer getFc() {
                return fc;
        }

        public void setFc(Integer fc) {
                this.fc = fc;
        }

        public Integer getTpc() {
                return tpc;
        }

        public void setTpc(Integer tpc) {
                this.tpc = tpc;
        }

        public Integer getPulso() {
                return pulso;
        }

        public void setPulso(Integer pulso) {
                this.pulso = pulso;
        }

        public String getHidratacao() {
                return hidratacao;
        }

        public void setHidratacao(String hidratacao) {
                this.hidratacao = hidratacao;
        }

        public String getLinfonodosSubmandibular() {
                return linfonodosSubmandibular;
        }

        public void setLinfonodosSubmandibular(String linfonodosSubmandibular) {
                this.linfonodosSubmandibular = linfonodosSubmandibular;
        }

        public String getLinfonodosPreEscapulares() {
                return linfonodosPreEscapulares;
        }

        public void setLinfonodosPreEscapulares(String linfonodosPreEscapulares) {
                this.linfonodosPreEscapulares = linfonodosPreEscapulares;
        }

        public String getLinfonodosPopliteos() {
                return linfonodosPopliteos;
        }

        public void setLinfonodosPopliteos(String linfonodosPopliteos) {
                this.linfonodosPopliteos = linfonodosPopliteos;
        }

        public String getLinfonodosInguinais() {
                return linfonodosInguinais;
        }

        public void setLinfonodosInguinais(String linfonodosInguinais) {
                this.linfonodosInguinais = linfonodosInguinais;
        }

        public String getMucosaOcular() {
                return mucosaOcular;
        }

        public void setMucosaOcular(String mucosaOcular) {
                this.mucosaOcular = mucosaOcular;
        }

        public String getMucosaOral() {
                return mucosaOral;
        }

        public void setMucosaOral(String mucosaOral) {
                this.mucosaOral = mucosaOral;
        }

        public String getMucosaPenianaVulvar() {
                return mucosaPenianaVulvar;
        }

        public void setMucosaPenianaVulvar(String mucosaPenianaVulvar) {
                this.mucosaPenianaVulvar = mucosaPenianaVulvar;
        }

        public String getMucosaAnal() {
                return mucosaAnal;
        }

        public void setMucosaAnal(String mucosaAnal) {
                this.mucosaAnal = mucosaAnal;
        }

        private String linfonodosPopliteos;
        private String linfonodosInguinais;
        private String mucosaOcular;
        private String mucosaOral;
        private String mucosaPenianaVulvar;
        private String mucosaAnal;

        @Override
        public String toString() {
                return super.toString();
        }
}
