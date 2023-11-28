package OrientaçãoaObjetos.Aula03.calculadora;
import java.util.Scanner;
public class CalculaDivisao {
    public static double divisao(int num, int den) {
        return num / den;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numerador: ");
        int num = input.nextInt();
        System.out.println("Digite o denominador: ");
        int den = input.nextInt();
        double result = divisao(num, den);
        System.out.println(result);

        input.close();
    }
}
