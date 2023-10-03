package OrientaçãoaObjetos.Aula01;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        conta C = new conta();
        conta vet[] = new conta[10];
        C.agencia = 1010;
        C.numConta = 10;
        C.cliente = "Pedro paulo";
        C.saldo = 1000;
        String opcao;
        int opc, cont =0;
        float valor = 0;
        
        System.out.println("Cliente: "+C.cliente);
        System.out.println("Número da conta: "+C.numConta);
        System.out.println("Cliente: "+C.cliente);
        System.out.println("Saldo: R$"+C.saldo);
        do {
        System.out.println("Qual operação deseja realizar?");
        System.out.println("1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Obter saldo");
        System.out.println("4 - Criar conta");
        opc = teclado.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Insira o valor que deseja depositar: ");
                valor = teclado.nextFloat();
                C.depositar(valor);
                System.out.println("Novo Saldo da conta: R$"+C.getSaldo());
                break;
            case 2:
                System.out.println("Insira o valor que deseja sacar: ");
                valor = teclado.nextFloat();
                C.sacar(valor);
                System.out.println("Novo saldo da conta: R$"+C.getSaldo());
                break;
            case 3:
                System.out.println("-------------------------");
                System.out.println("Saldo da conta: R$");
                System.out.println(C.getSaldo());
                System.out.println("-------------------------");
                break;
            case 4:
                for (int i=0; i < vet.length; i++) {
                    if (vet[i] == null) {
                        vet[i] = new conta();
                        System.out.println("-------------------------");
                        System.out.println("Insira os dados da conta: ");
                        System.out.println("Agência: ");
                        vet[i].agencia = teclado.nextInt();
                        System.out.println("Número da conta: ");
                        vet[i].numConta = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Nome do Cliente: ");
                        vet[i].cliente = teclado.nextLine();
                        System.out.println("Conta criada com sucesso!");
                        System.out.println("-------------------------");
                        cont++;
                        if (cont == 1) {
                            break;
                        }
                    }
                }
                break;
            default: break;
        }
        teclado.nextLine();
        System.out.println("Deseja realizar mais alguma operação(Sim || Não)?");
        opcao = teclado.nextLine();
    } while(opcao.equalsIgnoreCase("Sim"));
    teclado.close();
    }
}
