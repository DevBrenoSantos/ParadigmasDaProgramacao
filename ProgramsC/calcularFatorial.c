#include <stdio.h>

int calcularFatorial(int numero);

int main() {
    int n;
    printf("Digite um número inteiro não negativo: ");
    scanf("%d", &n);

    if (n < 0) {
        printf("O fatorial não está definido para números negativos.\n");
    } else {
        int resultado = calcularFatorial(n);
        printf("O fatorial de %d é %d\n", n, resultado);
    }

    return 0;
}

int calcularFatorial(int numero) {
    if (numero == 0 || numero == 1) {
        return 1;
    } else {
        int fatorial = 1;
        for (int aux = 2; aux<= numero; aux++) {
            fatorial *= aux;
        }
        return fatorial;
    }
}