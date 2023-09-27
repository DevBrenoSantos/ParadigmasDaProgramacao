#include <stdio.h>

#define NUM_AVALIACOES 3

typedef struct Aluno {
    int mat;
    char nome[250];
    double nota[3], media;
} Aluno;


Aluno preencheAluno (Aluno *a) {
    float soma=0;
    printf("Digite a matrícula: ");
    scanf("%d", &*a.mat);
    setbuf(stdin, 0); // Bug, método pra pular linha◘

    printf("Digite o nome do aluno: ");
    scanf("%[^\n]", Alu.nome);

    for (int i=0; i<NUM_AVALIACOES; i++) {
        printf("Digite a %d nota: %", i+1);
        scanf("%f", &Alu.nota[i]);
    }

    Alu.media = soma/NUM_AVALIACOES;◘

}

int main() {
    Aluno Alu;
    float soma=0;

    Alu = preencheAluno(Alu);

    printf("Matr.: %d\n", Alu.mat);

    printf("Nome aluno: %s\n", Alu.nome);



    for (int i=0; i<NUM_AVALIACOES; i++) {
        printf("Nota %d: %.2f\n", i+1, Alu.nota[i]);  
    }

    printf("Media: %.2f\n", Alu.media);

    return 0;
}
