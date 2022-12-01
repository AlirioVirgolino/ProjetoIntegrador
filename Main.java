
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        FichaAtendimento ficha;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            ficha = new FichaAtendimento();
            System.out.println();
            System.out.println("555555555555555555555555555555555555555555AAAAAAAAAAAAAAAAAAAA5A5555AAAA5A5AAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                    "55555555555555555555555555555555A55555555555AAAAAAAAAAAAAAAA5AAAA3‘    .,5AAAAAAAAAAAAAAAAAAAAAAAAAA\n" +
                    "5555555555555555555555555555555555555555555555AAAAAAAAAAAA5AA,.   .      ,A5AAA5AAAAAAAAAAAAAAAAAAAA\n" +
                    "555555555555555555555555555555555555A55555555555A555AA5AAAAAAC..    .   ¦\"A5AAAAAAAAAAAAAAAAAAAAAAAA\n" +
                    "5555555555555555555555555555555555555555555555555AAAAA5AAAAAA5%\"..  ‘(J,. ¦%A5AAAAAAAAAAAAAAAAAAAAAA\n" +
                    "55555555555555A5555555555555555555555555555555555555AA555AAAAA$\"A5% .      *A5AAAAAAAAAAAAAAAAAAAAAA\n" +
                    "555555555A‘.         ‘$A5A55555555555555555A5AAAA5A55AAAAAA!.. .$A$         .%AAAAAAAAAAAAAAAAAAAAAA\n" +
                    "555555555%‘    ‘...    ‘A555555555555555555A‘   (A5AA555A‘.   . ‘A,.          ‘AAAAAAAA5AAAAAAAAAAAA\n" +
                    "555555555A.  .*AA5A%.  .‘A5AA%!‘‘‘‘‘CA5A5!‘‘    .‘\"%A555AC‘..   .3C.         . .‘%A5AAAAA55AAAAAAAAA\n" +
                    "555555555A.  .!5A55A‘   .A5$‘        .\"A5,..  .  .‘$555A555A‘.    ¦%*.        .   ‘%AAAA5$3AA5AAAAAA\n" +
                    "555555555A.   *%AA3‘    ¦5%.  .JA5A\". .,55AA‘  .(A5A555555AA(      ..$3. .          .$A5AA‘.(A5AAAAA\n" +
                    "555555555A‘           .C55!   .C333J   ‘A5AA.  .(55AAA555A5$‘      .  ‘%.             ‘AAA3. ‘%AAAAA\n" +
                    "555555555A.   .‘‘‘,¦$A5555*  ....... . ‘A55A.   (A555A55A5AA‘         .,%.              ¦A$. .%5AAAA\n" +
                    "555555555A.   *55555555555(   .%55555555555A‘   (A5555A5555A¦.         .$¦              ...  ‘A5AAAA\n" +
                    "555555555A‘   *55555555555A.    ‘*,\"‘‘\"C555A‘   ,$$A5555A5A5\"           ‘%.  .. ..         .‘AA5AAAA\n" +
                    "555555555A.   *5555555555A5AC.       ..J5555J.    .$555A!!AA‘           .$‘.‘AA!.         \"AAAA5AAAA\n" +
                    "555555555A5AAA55555555555555A5AAAAAA55A555555AA5AA5AA5AC.$A$..J.        .%\".¦AA*         ‘A5AAAAAAAA\n" +
                    "5555555555AAAAAAAAAA555555555555555555A555555555555555A5A%J ..  .       .$‘\"AAA\"..     .%5AAAAAAAAAA\n" +
                    "555555555A.        . ‘CA5A55555555555555555555555555555555AA5AA55AAA5AAAA5AA5A55AAAAAAAAA5AA5AA5AAAA\n" +
                    "555555555A.   ..‘..   ..A5A55555555555555555555555555555555AA555A555AA555AA5AA5AAAAAAA5AA55AAAAAAAAA\n" +
                    "555555555A.   ,5A55%‘   .A5$.  .¦. .%55A¦. .  .‘%AA55%‘.     ..35A5A‘. .(‘. . .J‘.   .‘%AAAAA5AAAAAA\n" +
                    "555555555A.   ,55555C   .%5$       ‘%A¦    ..    ‘A55%......    .AAA‘.   ..        .   .%AAAAAAAAAAA\n" +
                    "555555555A.   ,55555C   .$5$   .%A5A5$.  .%55A(.  ‘A55555555A.  .35A‘.  ¦A5A.  .!A5A. . *AAAAA5AAAAA\n" +
                    "555555555A.   ,55555C   .%5$   .%A555!    ‘‘‘‘.   ‘A55AC,‘‘.... .C5A.  .¦5A%.   ¦AAA.   *5AAAAAAAAAA\n" +
                    "5555555555.   ,55555¦   .A5$   .A5555!  . .‘‘.‘‘..‘AA‘.  .‘,,.  .J5A.   ¦55A.   ¦55A.   *AA5AAAAAAAA\n" +
                    "555555555A.  .,AA55J.   ‘55$   .A5555C   .%55555A555%.. .AAA%.  .J5A.   ¦55A.   ¦55A.   *AA5AAAAAAAA\n" +
                    "555555555A.   ... .    \"A55$   .A5555A*.. . ...  .JAA.  ..‘‘.   .C5A.   ¦55A.   ¦55A.   *AA55AAAAAAA\n" +
                    "5555555555‘..     ...(A5555$.. .A555555A,‘.   ...‘C555‘..  .‘.. .C5A‘...¦55A‘...¦AAA‘...*AA55A55AAAA\n" +
                    "5555555555555555555555555555555555555555555555555555555555555555A555555AA55555AAA5A5A5AAAA55555555AA\n" +
                    "555555555555555555555555555555555555555555555555555555555555A5555A555555555A5555555A555555A55A555555");


            System.out.println("");
            System.out.println("");

            System.out.println("#################### PetDream System ####################");
            System.out.println("Digite Login: ");
            String login = scanner.nextLine();
            System.out.println("Digite a senha: ");
            String senha = scanner.nextLine();
            if(login.equals("pet") && senha.equals("123")){
                System.out.printf("Usuário %s logado com sucesso.", login);
            }else{
                System.out.println("Login ou senha inválidos!");break;
            }

            System.out.println("");
            System.out.println("");

            System.out.println("#################### NOVA FICHA DE ATENDIMENTO ####################");

            System.out.print("Insira o RG: ");
            String rg = scanner.nextLine();
            ficha.setRg(rg);
            // System.out.println(rg);

            System.out.print("Insira a data: ");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("pt", "BR"));
            String dateString = scanner.nextLine();
            LocalDate date = LocalDate.parse(dateString, formatter);
            ficha.setData(date);
            //System.out.println(date);

            System.out.println("#################### Dados do responsável ####################");

            System.out.print("Insira o nome do Tutor: ");
            String tutor = scanner.nextLine();
            ficha.getAnimal().getTutor().setNome(tutor);

            System.out.print("Insira o CPF do Tutor: ");
            String cpf = scanner.nextLine();
            ficha.getAnimal().getTutor().setCpf(cpf);

            System.out.print("Insira o endereço do Tutor: ");
            String endereco = scanner.nextLine();
            ficha.getAnimal().getTutor().setEndereco(endereco);

            System.out.print("Insira a cidade do Tutor: ");
            String cidade = scanner.nextLine();
            ficha.getAnimal().getTutor().setCidade(cidade);

            System.out.print("Insira a UF do Tutor: ");
            String uf = scanner.nextLine();
            ficha.getAnimal().getTutor().setUf(uf);

            System.out.print("Insira o telefone fixo do Tutor: ");
            String telefonefixo = scanner.nextLine();
            ficha.getAnimal().getTutor().setTelefoneFixo(telefonefixo);

            System.out.print("Insira o telefone celular do Tutor: ");
            String telefonecelular = scanner.nextLine();
            ficha.getAnimal().getTutor().setTelefoneCelular(telefonecelular);

            System.out.println("#################### IDENTIFICAÇÃO DO ANIMAL ####################");

            System.out.print("Insira o nome do animal: ");
            String nome = scanner.nextLine();
            ficha.getAnimal().setNome(nome);

            System.out.print("Insira a especie do animal: ");
            String es = scanner.nextLine();
            ficha.getAnimal().setEspecie(es);

            System.out.print("Insira a raça do animal: ");
            String raca = scanner.nextLine();
            ficha.getAnimal().setRaca(raca);

            System.out.print("Insira o sexo do animal: ");
            String sexo = scanner.nextLine();
            ficha.getAnimal().setSexo(sexo);

            System.out.print("Insira a idade do animal: ");
            String idade = scanner.nextLine();
            ficha.getAnimal().setIdade(Integer.valueOf(idade));

            System.out.print("Insira o peso do animal: ");
            String peso = scanner.nextLine();
            ficha.getAnimal().setPeso(Float.valueOf(peso));

            System.out.print("Insira a pelagem do animal: ");
            String pelagem = scanner.nextLine();
            ficha.getAnimal().setPelagem(pelagem);

            System.out.print("Insira a procedência do animal: ");
            String procedencia = scanner.nextLine();
            ficha.getAnimal().setProcedencia(procedencia);

            System.out.println("#################### ANAMNESE GERAL ####################");

            System.out.print("Insira a queixa principal do animal: ");
            String queixaprincipal = scanner.nextLine();
            ficha.getAnimal().getAnamneseGeral().setQueixaPrincipal(queixaprincipal);

            System.out.print("Insira a história médico pregresso do animal: ");
            String historicomedico = scanner.nextLine();
            ficha.getAnimal().getAnamneseGeral().setHistoricoMedico(historicomedico);

            System.out.print("Insira a alimentação do animal: ");
            String alimentacao = scanner.nextLine();
            ficha.getAnimal().getAnamneseGeral().setAlimentacao(alimentacao);

            System.out.print("Insira o contactante do animal: ");
            String contactante = scanner.nextLine();
            ficha.getAnimal().getAnamneseGeral().setContactantes(contactante);

            System.out.print("Insira a(s) vacina(s) do animal: ");
            String vacina = scanner.nextLine();
            ficha.getAnimal().getAnamneseGeral().setVacinacao(vacina);

            System.out.print("Insira a(s) vermifugação(ões) do animal: ");
            String vermifugacao = scanner.nextLine();
            ficha.getAnimal().getAnamneseGeral().setVermifugacao(vermifugacao);

            System.out.print("Insira o ambiente do animal: ");
            String ambiente = scanner.nextLine();
            ficha.getAnimal().getAnamneseGeral().setAmbiente(ambiente);

            System.out.println("#################### ANAMNESE ESPECIAL ####################");

            System.out.print("Insira queixa respiratória: ");
            String queixarespiratoria = scanner.nextLine();
            ficha.getAnimal().getAnamneseEspecial().setSistemaRespiratorio(queixarespiratoria);

            System.out.print("Insira queixa cardiovascular: ");
            String queixacardiovascular = scanner.nextLine();
            ficha.getAnimal().getAnamneseEspecial().setSistemaCardiovascular(queixacardiovascular);

            System.out.print("Insira queixa do sistema digestório: ");
            String queixadigestorio = scanner.nextLine();
            ficha.getAnimal().getAnamneseEspecial().setSistemaDigestorio(queixadigestorio);

            System.out.print("Insira queixa do sistema urinário: ");
            String queixaurinaria = scanner.nextLine();
            ficha.getAnimal().getAnamneseEspecial().setSistemaUrinario(queixaurinaria);

            System.out.print("Insira queixa do sistema reprodutor: ");
            String queixareprodutor = scanner.nextLine();
            ficha.getAnimal().getAnamneseEspecial().setSistemaReprodutor(queixareprodutor);

            System.out.print("Insira queixa do sistema locomotor: ");
            String queixalocomotor = scanner.nextLine();
            ficha.getAnimal().getAnamneseEspecial().setSistemaLocomotor(queixalocomotor);

            System.out.print("Insira queixa do sistema neurológico: ");
            String queixaneurologico = scanner.nextLine();
            ficha.getAnimal().getAnamneseEspecial().setSistemaNeurologico(queixaneurologico);

            System.out.print("Insira queixa da pele: ");
            String queixapele = scanner.nextLine();
            ficha.getAnimal().getAnamneseEspecial().setPeleEAnexos(queixapele);

            System.out.print("Insira queixa dos olhos: ");
            String queixaolhos = scanner.nextLine();
            ficha.getAnimal().getAnamneseEspecial().setOlhos(queixaolhos);

            System.out.println("#################### EXAME FÍSICO ####################");

            System.out.print("Insira a postura: ");
            String postura = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setPostura(postura);

            System.out.print("Insira o nível de consciência: ");
            String niveldeconsciencia = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setNivelDeConsciencia(niveldeconsciencia);

            System.out.print("Insira o escore corporal: ");
            String escorecorporal = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setEscoreCorporal(escorecorporal);

            System.out.print("Insira a temperatura retal do animal: ");
            String tr = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setTr(Float.valueOf(tr));

            System.out.print("Insira a frequencia respiratória: ");
            String fr = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setFr(Integer.valueOf(fr));

            System.out.print("Insira a frequencia cardíaca: ");
            String fc = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setFc(Integer.valueOf(fc));

            System.out.print("Insira a TPC: ");
            String tpc = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setTpc(Integer.valueOf(tpc));

            System.out.print("Insira o pulso: ");
            String pulso = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setPulso(Integer.valueOf(pulso));

            System.out.print("Insira a hidratação: ");
            String hidratacao = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setHidratacao(hidratacao);

            System.out.print("Insira se tem linfonodo(s) Submandibular(es): ");
            String linfonodossubmandibular = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setLinfonodosSubmandibular(linfonodossubmandibular);

            System.out.print("Insira se tem linfonodo(s) PreEscapulares(es): ");
            String linfonodospreescapulares = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setLinfonodosSubmandibular(linfonodospreescapulares);

            System.out.print("Insira se tem linfonodo(s) Popliteos: ");
            String linfonodospopliteos = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setLinfonodosPopliteos(linfonodospopliteos);

            System.out.print("Insira se tem linfonodo(s) Inguinais: ");
            String linfonodosinguinais = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setLinfonodosInguinais(linfonodosinguinais);

            System.out.print("Insira exame da mucosa ocular: ");
            String mucosaocular = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setMucosaOcular(mucosaocular);

            System.out.print("Insira exame da mucosa Peniana Vulvar: ");
            String mucosapenianavulvar = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setMucosaPenianaVulvar(mucosapenianavulvar);

            System.out.print("Insira exame da mucosa Anal: ");
            String mucosaanal = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setMucosaAnal(mucosaanal);

            System.out.print("Insira exame da mucosa oral: ");
            String mucosaoral = scanner.nextLine();
            ficha.getAnimal().getExameFisico().setMucosaOral(mucosaoral);

            String textoDigitado = scanner.nextLine();
            System.out.println(textoDigitado);

            gravaObjetoJavaNoArquito(ficha,"meu_arquivo.txt");
            System.out.println("Ficha gravada com sucesso!");

            Object lendoficha = recuperaObjetoGravadoNoArquivo("meu_arquivo.txt");
            System.out.println(lendoficha);

            if (textoDigitado.equals("0")) break;
        }
    }
    public static void  gravaObjetoJavaNoArquito(Object object, String caminho_do_arquivo_txt) throws IOException {
        FileOutputStream arquivo = new FileOutputStream(caminho_do_arquivo_txt);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(arquivo);

        objectOutputStream.writeObject(object);
        objectOutputStream.close();
    }

    public static Object recuperaObjetoGravadoNoArquivo(String caminho_do_arquivo_txt) {

        Object objeto = null;

        try {
            FileInputStream restFile = new FileInputStream(caminho_do_arquivo_txt);
            ObjectInputStream stream = new ObjectInputStream(restFile);

            objeto = stream.readObject();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return objeto;
    }
}




