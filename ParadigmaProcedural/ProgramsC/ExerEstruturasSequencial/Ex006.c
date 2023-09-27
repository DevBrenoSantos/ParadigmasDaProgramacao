#include <stdio.h>

int main(int argc, char const *argv[]) {
    int x, y, resto;
    printf("Insira um número qualquer: ");
    scanf("%d", &x);
    printf("Insira um outro número qualquer: ");
    scanf("%d", &y);
    resto = x % y;
    printf("O resto da divisão foi: %d", resto);
    return 0;
}
