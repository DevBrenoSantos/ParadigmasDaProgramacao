#include <stdio.h>

int main(int argc, char const *argv[]) {
    float num1, num2, num3, num4;
    float p1=1, p2=2, p3=3, p4=4;
    float mediaPonderada;
    printf("Digite o primeiro número: ");
    scanf("%f", &num1);

    printf("Digite o segundo número: ");
    scanf("%f", &num2);

    printf("Digite o terceiro número: ");
    scanf("%f", &num3);

    printf("Digite o quarto número: ");
    scanf("%f", &num4);

    mediaPonderada = ((num1 * p1) + (num2 * num2) + (num3 * p3) + (num4 * p4))/4;
    printf("Média ponderada: %f", mediaPonderada);
    return 0;
}
