#include <stdio.h>

int main(int argc, char const *argv[]) {
    int num1, num2, num3, product;
    printf("Insira o primeiro número: ");
    scanf("%d", &num1);
    printf("Insira o segundo número: ");
    scanf("%d", &num2);
    printf("Insira o terceiro número: ");
    scanf("%d", &num3);

    product = num1 * num2 * num3;

    printf("O produto é: %d", product);
    return 0;
}
