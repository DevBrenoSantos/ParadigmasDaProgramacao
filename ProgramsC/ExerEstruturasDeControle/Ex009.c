#include <stdio.h>
#include <math.h>

int main(int argc, char const *argv[]) {
    float area, raio, pi = 3.14;
    printf("Insira o valor do raio da circunferencia: ");
    scanf("%f", &raio);
    area = pi * pow(raio, 2);
    printf("A área da circunferência é: %f", area);
    return 0;
}
