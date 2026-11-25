import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class Main {
    
    public static void main(String[] args) {

        Academia academia = new Academia(null, null);

        public void criarTresAtividadesDoisPlanos() {

            Atividade atividade1 = new Atividade("Musculacao");
            Atividade atividade2 = new Atividade("Spinning");
            Atividade atividade3 = new Atividade("Natacao");

            Plano plano1 = new Plano("Basico");
            Plano plano2 = new Plano("Premium");

        }
        
        System.out.println("1. Associar atividades a um plano");
        System.out.println("2. Exibir todas as atividades cadastradas");
        System.out.println("3. Exibir todos os planos cadastrados");
        System.out.println("4. Exibir apenas planos ativos");
        System.out.println("5. Emitir certificado para objetos que implementam a interface Certificavel");
        System.out.println("6. Registrar presença em atividades que implementam a interface ControladorPresenca");
        System.out.println("7. Remover atividades inativas do sistema");
        System.out.println("Insira a opção: ");
        int opcao = Scanner.nextInt();
        switch (opcao) {

            case 1:
                System.out.println("Digita a atividade: ");
                System.out.println("Digite o plano: ");
            case 2:
                System.out.println();
                academia.exibirAtividadesCadastradas();

            case 3:
                academia.exibirPlanosCadastrados();

            case 4:
                academia.exibirPlanosAtivos();

            case 5:
                academia.emitirCertificados();

            case 6:
                academia.registrarPresenca();

            case 7:
                academia.removerAtividades();

        }

    }

   
}
