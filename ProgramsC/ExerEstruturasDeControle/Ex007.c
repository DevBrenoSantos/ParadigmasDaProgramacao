#include <stdio.h>

int main(int argc, char const *argv[]) {
    float lado1, lado2, area, perimetro;
    printf("Insira um lado do retâgulo: ");
    scanf("%f", &lado1);
    printf("Insira o outro lado do retângulo: ");
    scanf("%f", &lado2);
    area = lado1 * lado2;
    perimetro = (lado1 * 2) + (lado2 * 2);
    printf("A área do retângulo é: %2.f", area);
    printf("\nO Perímetro do retângulo é: %2.f", perimetro);
    return 0;
}
