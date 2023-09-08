#include <stdio.h>

int main(int argc, char const *argv[])
{
    float num1, num2, num3, media;
    printf("Insira o primerio número: ");
    scanf("%f", &num1);
    printf("Insira o segundo número: ");
    scanf("%f", &num2);
    printf("Insira o terceiro número: ");
    scanf("%f", &num3);

    media = (num1 + num2 + num3)/3;

    printf("Média dos números informandos: %f", media);
    return 0;
}
