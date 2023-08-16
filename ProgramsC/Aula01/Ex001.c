#include <stdio.h>

int main()
{
    char nome[20]; 
    int idade;
    printf("Digite o nome: ");
    scanf("%[^\n]", nome);
    // scanf("%s, nome");
    setbuf(stdin, 0);
    printf("Digite a idade: ");
    scanf("%d", &idade);
    printf("Nome: %s, %d anos", nome, idade);
}
