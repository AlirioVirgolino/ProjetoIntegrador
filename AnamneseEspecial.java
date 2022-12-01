import java.io.Serializable;

public class AnamneseEspecial implements Serializable {

        private String sistemaRespiratorio;
        private String sistemaCardiovascular;
        private String sistemaDigestorio;
        private String sistemaUrinario;
        private String sistemaReprodutor;

        public String getSistemaRespiratorio() {
                return sistemaRespiratorio;
        }

        public void setSistemaRespiratorio(String sistemaRespiratorio) {
                this.sistemaRespiratorio = sistemaRespiratorio;
        }

        public String getSistemaCardiovascular() {
                return sistemaCardiovascular;
        }

        public void setSistemaCardiovascular(String sistemaCardiovascular) {
                this.sistemaCardiovascular = sistemaCardiovascular;
        }

        public String getSistemaDigestorio() {
                return sistemaDigestorio;
        }

        public void setSistemaDigestorio(String sistemaDigestorio) {
                this.sistemaDigestorio = sistemaDigestorio;
        }

        public String getSistemaUrinario() {
                return sistemaUrinario;
        }

        public void setSistemaUrinario(String sistemaUrinario) {
                this.sistemaUrinario = sistemaUrinario;
        }

        public String getSistemaReprodutor() {
                return sistemaReprodutor;
        }

        public void setSistemaReprodutor(String sistemaReprodutor) {
                this.sistemaReprodutor = sistemaReprodutor;
        }

        public String getSistemaLocomotor() {
                return sistemaLocomotor;
        }

        public void setSistemaLocomotor(String sistemaLocomotor) {
                this.sistemaLocomotor = sistemaLocomotor;
        }

        public String getSistemaNeurologico() {
                return sistemaNeurologico;
        }

        public void setSistemaNeurologico(String sistemaNeurologico) {
                this.sistemaNeurologico = sistemaNeurologico;
        }

        public String getPeleEAnexos() {
                return peleEAnexos;
        }

        public void setPeleEAnexos(String peleEAnexos) {
                this.peleEAnexos = peleEAnexos;
        }

        public String getOlhos() {
                return olhos;
        }

        public void setOlhos(String olhos) {
                this.olhos = olhos;
        }

        private String sistemaLocomotor;
        private String sistemaNeurologico;
        private String peleEAnexos;
        private String olhos;

        @Override
        public String toString() {
                return super.toString();
        }
}
