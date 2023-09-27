#include <stdio.h>

typedef struct Aluno {
    int mat;
    char nome[250];
    double nota[3], media;
} Aluno;


int main() {
Aluno Alu[3];
    for (int i=0; i<=2; i++) {

    }
    for (int aux=0; aux<=2; aux++) {
        printf("Dados do Aluno: \n");
        printf("Matr.: %d\n", Alu[aux].mat);
        printf("Nome: %s\n", Alu[aux].nome);
        printf("Notas: \n");
        for (int i=0; i<=3; i++) {
            printf("%.1lf\n", Alu[aux].nota[i]);
        }
        printf("Média: %.1lf\n", Alu[aux].media);
    }

    return 0;
}
// Terminar                  