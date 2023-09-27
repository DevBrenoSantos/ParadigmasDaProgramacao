#include <stdio.h>

void calcularFibonacci(int limite);

int main() {
    int limite;

    printf("DIgite um limite para a sequência de Fibonacci: ");
    scanf("%d", &limite);

    calcularFibonacci(limite);
    return 0;
}

void calcularFibonacci(int limite) {
    int primeiro = 0, segundo = 1, proximo;
    printf("Sequência de Fibonacci até %d:\n", limite);

    while (primeiro <= limite) {
        printf("%d, ", primeiro);
        proximo = primeiro + segundo;
        primeiro = segundo;
        segundo = proximo;
    }
    
    printf("\n");
}