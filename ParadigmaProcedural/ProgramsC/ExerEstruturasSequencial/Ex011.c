#include <stdio.h>

int main() {
    double salario, percent;
    printf("Para comerçarmos, insira seu atual salário: ");
    scanf("%lf", &salario);
    percent = salario * 0.25;
    salario = salario + percent;
    printf("Seu novo salário é: %.2f", salario);
    return 0;
}
