#include <stdio.h>
#include <math.h>

int main() {
    double A, B, C, D, R1, R2, RD;
    printf("-- Programa para calcular equações de segundo grau --");
    printf("Insira o valor de A: ");
    scanf("%lf", &A);
    printf("Insira o valor de B: ");
    scanf("%lf", &B);
    printf("Insira o valor de C: ");
    scanf("%lf", &C);

    D = B * B - 4 * A * C;

    if (D > 0) {
        RD = sqrt(D);
        R1 = (-B + RD) / (2 * A);
        R2 = (-B - RD) / (2 * A);
        printf("As raízes são: %.4f e %.4f\n", R1, R2);
    } else if (D == 0) {
        R1 = -B / (2 * A);
        printf("A raiz é: %.4f\n", R1);
    } else {
        printf("A equação não possui raízes reais.\n");
    }
}
