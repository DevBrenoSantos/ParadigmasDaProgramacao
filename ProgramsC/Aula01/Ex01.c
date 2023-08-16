#include <stdio.h>

int main() {
    float base, altura, resultado;
    printf("Insira o valor da base do triângulo: ");
    scanf("%f", &base);
    printf("Insira o valor da Altura do triângulo: ");
    scanf("%f", &altura);
    resultado = (base * altura)/2;
    printf("A área do triângulo é: %.2f", resultado) ;
    return 0;
}
