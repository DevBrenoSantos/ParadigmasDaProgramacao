#include <stdio.h>
#include <math.h>

int main() {
    float num;
    float cubo, raiz2, raiz3, sen, coss;
    printf("Insira um número: ");
    scanf("%f", &num);
    cubo = pow(num, 3);
    raiz2 = sqrt(num);
    raiz3 = cbrt(num);
    sen = sin(num);
    coss = cos(num);
    printf("Cubo: %f \nRaiz quadrada: %f \nRaiz cúbica: %f \nSeno: %.4f \nCosseno: %.4f", cubo, raiz2, raiz3, sen, coss);
    return 0;
}
