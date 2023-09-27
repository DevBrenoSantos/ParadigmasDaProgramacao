#include <stdio.h>

int main() {
    double salario, comissao;
    printf("Insira o seu salário fixo: ");
    scanf("%lf", &salario);

    printf("Insira o valor total de suas vendas: ");
    scanf("%lf", &comissao);

    comissao = comissao * 0.04;
    salario = salario + comissao;
    
    printf("A comissão foi de: %.2f\n", comissao);
    printf("O seu salário do mês: %.2f", salario);
    return 0;
}
