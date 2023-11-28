package TesteTrabalhoFinal;

import java.util.Scanner;

public class main {
    public static void loadData() {
        Voo voo01 = new Voo("BH","SP", 1010);
        Passageiro Teste1 = new Passageiro("8484198-54","safada da silva","rua casada da silva","10:35",31,31,31,1010);
        Passageiro Teste2 = new Passageiro("8484198-53","gasosa da silva","rua casada da silva","10:35",31,31,31,1010);
        Passageiro Teste3 = new Passageiro("8484198-54","delicio da silva","rua casada da silva","10:35",31,31,31,1010);
        Passageiro Teste4 = new Passageiro("8484198-54","sanhado da silva","rua casada da silva","10:35",31,31,31,1010);
        Passageiro Teste5 = new Passageiro("8484198-54","gasoso da silva","rua casada da silva","10:35",31,31,31,1010);
        Passageiro Teste6 = new Passageiro("8484198-54","casos bahia da silva","rua casada da silva","10:35",31,31,31,1010);
        Passageiro Teste7 = new Passageiro("8484198-54","daniel da silva","rua casada da silva","10:35",31,31,31,1010);
        Passageiro Teste8 = new Passageiro("8484198-54","filipe da silva","rua casada da silva","10:35",31,31,31,1010);
        Passageiro Teste9 = new Passageiro("8484198-54","danilo da silva","rua casada da silva","10:35",31,31,31,1010);
        Passageiro Teste10 = new Passageiro("8484198-54","joao da silva","rua casada da silva","10:35",31,31,31,1010);
        voo01.cadrastrarPassageiro(Teste1);
        voo01.cadrastrarPassageiro(Teste2);
        voo01.cadrastrarPassageiro(Teste3);
        voo01.cadrastrarPassageiro(Teste4);
        voo01.cadrastrarPassageiro(Teste5);
        voo01.cadrastrarPassageiro(Teste6);
        voo01.cadrastrarPassageiro(Teste7);
        voo01.cadrastrarPassageiro(Teste8);
        voo01.cadrastrarPassageiro(Teste9);
        voo01.cadrastrarPassageiro(Teste10);
    }

    public static void telaBasica(){
        Scanner in = new Scanner(System.in);
        System.out.println("Qual será o número de voo?");
        String nVoo = in.nextLine();
        String voo = "BH-SP";
        System.out.println("\nEMPRESA AÉREA QUEDA LIVRE - VOO "+ voo);
    }

    public static int menuPrincipal() {
        int op;
        Scanner in = new Scanner(System.in);
        System.out.println("\n        MENU DE OPÇÕES");
        System.out.println("[1] Mostrar Lista de Passageiros ");
        System.out.println("[2] Pesquisar Passageiro por CPF");
        System.out.println("[3] Pesquisar Passageiro por Nome");
        System.out.println("[4] Cadastrar Passageiro");
        System.out.println("[5] Remover Passageiro");
        System.out.println("[6] Mostrar Lista de Espera");
        System.out.println("[7] Excluir Passageiro da Lista");
        System.out.println("[8] Mostrar Fila de Espera");
        System.out.println("[9] Sair");
        System.out.println("Digite sua opção:");
        op = in.nextInt();
        return op;
    }

    public static void menuSecundario(int op) {
        Scanner teclado = new Scanner(System.in);
        switch (op) {
            case 1:
                System.out.println("========== Lista de Passageiros =============================");
                Voo.ImprimirPassageiros();
                break;
            case 2:
                System.out.print("Digite o CPF do passageiro a ser pesquisado:");
                String cpf = teclado.nextLine();
                Voo.ProcurarPassageiroCpf(cpf);


                break;
            case 3:
                System.out.print("Digite o nome do passageiro a ser pesquisado:");
                String nome = teclado.nextLine();
                Voo.ProcurarPassageiroNome(nome);

                break;
            case 4:
                System.out.println("Cadastrando Passageiro");

                break;
            case 5:
                System.out.println("Removendo Passageiro");
                System.out.println("Digite o nome do passageiro para ser removido :");
                String excluir = teclado.nextLine();
                Voo.ExcluirPassageiro(excluir);
                break;
            case 6:
                System.out.println("========== Lista de Espera ==================================");

                break;
            case 7:
                System.out.println("Excluindo Passageiro da Lista");
                System.out.println("Digite o nome do passageiro a ser removido da lista de espera: ");
                String nomeLista = teclado.nextLine();
                Voo.ExcluirPassageiroListaEspera(nomeLista);

                break;
            case 8:
                System.out.println("========== Fila de Espera ===================================");
                Voo.ImprimirListaEspera();

                break;
            default:
                if (op != 9)
                    System.out.println("Opcao Invalida.");
                else
                    System.out.println("Programa encerrado.");
        }
    }

    public static void main(String[] args) {
        int op = 0;
        loadData();
        telaBasica();
        while (op != 9) {
            op = menuPrincipal();
            menuSecundario(op);
        }
    }

}
