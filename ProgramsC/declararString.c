#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char nome[10];
    printf("Insira seu nome: ");
    scanf("%s", nome);
    printf("Seu nome é: %s", nome);

    printf("\nNome na vertical: \n");
    for (int aux=0; aux<=strlen(nome); aux++) {
        printf("%c\n", nome[aux]);

    }
    return 0;
}
