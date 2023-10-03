package OrientaçãoaObjetos.Aula01;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        conta C = new conta();
        C.agencia = 1010;
        C.numConta = 10;
        C.cliente = "Pedro paulo";
        C.saldo = 1000;
        conta.numContas++;

        String opcao;
        int opc;
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
        opc = teclado.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Insira o valor que deseja depositar: ");
                valor = teclado.nextFloat();
                C.depositar(valor);
                break;
            case 2:
                System.out.println("Insira o valor que deseja sacar: ");
                valor = teclado.nextFloat();
                C.sacar(valor);
                System.out.println(C.getSaldo());
                break;
            case 3:
                System.out.println(C.getSaldo());
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
