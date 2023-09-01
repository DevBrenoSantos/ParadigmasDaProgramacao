#include <stdio.h>

int main() {
    double salario, taxa, percent;
    printf("Insira o salária que sofrerá alteração: ");
    scanf("%lf", &salario);
    printf("Insira o percentual do aumento: ");
    scanf("%lf", &percent);
    percent = percent/100;
    taxa = salario * percent;
    salario = salario + taxa;
    printf("O aumento foi de: %.2f", taxa);
    printf("Seu novo salário é: %.2f", salario);
    return 0;
}
