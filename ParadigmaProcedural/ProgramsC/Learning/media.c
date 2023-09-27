#include <stdio.h>
#include <stdlib.h>

int main() {
    float nota1, nota2, nota3, media;
    printf("Insira a primeira nota: ");
    scanf("%f", &nota1);
    printf("Insira a segunda nota: ");
    scanf("%f", &nota2);
    printf("Insira a terceira nota: ");
    scanf("%f", &nota3);
    media = (nota1 + nota2 + nota3)/3.0;
    printf("\nNotas Inseridas:\n");
    printf("Nota 1: %.2f\n", nota1);
    printf("Nota 2: %.2f\n", nota2);
    printf("Nota 3: %.2f\n", nota3);
    printf("Média: %.2f", media);
}
