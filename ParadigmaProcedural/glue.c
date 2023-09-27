// Ponteiros
int myAge = 43;
int* ptr = &myAge;

// Imprime o endereço de memória de myAge (0x7ffe5367e044)
printf("%p\n", ptr);

// Imprime o valor armazenado por myAge (43) usando derreferência ou indireção
printf("%d\n", *ptr);

// Altera o valor de myAge usando o ponteiro por derreferência ou indireção
*ptr = 51;

// Imprime o o valor armazenado em myAge (51)
printf("%d\n", myAge);

// Iniciar um ponteiro com NULL é o mesmo que o iniciar com "0". Expressões	equivalentes: 
int* ptr = NULL;
int* ptr = 0;

// Operações com ponteiros 

int x1 = 43, x2 = 51;
int *ptr1 = &x1, *ptr2 = &x2;

// ptr1 passa a apontar para x2
ptr1 = ptr2;

// Imprime o valor armazenado por x2 (51)
printf("%d\n", *ptr1);

int myAge = 43;
int* ptr = &myAge;

// Imprime o endereço de memória de myAge (0x7ffe5367e044)
printf("%p\n", ptr);

// Imprime o tamanho em memória de myAge – int - em bytes (4)
printf("%d\n", sizeof(myAge));

// Incrementa o ponteiro – vai para o próximo endereço de memória com referência a
// int - avança 4 bytes
ptr++;

// Imprime o endereço de memória apontado por ptr (0x7ffe5367e048).
printf("%p\n", ptr);

// Imprime o endereço de memória correspondente ao avanço de 8 bytes (2 * 4) a
// partir de ptr (0x7ffe5367e050). ptr não foi alterado
printf("%p\n", ptr+2);

// Imprime o endereço de memória apontado por ptr (0x7ffe5367e048).
printf("%p\n", ptr);

// Exemplos: 
int myNumbers[4] = {25, 50, 75, 100};
    for (int i = 0; i < 4; i++) {
        printf("%d\n", myNumbers[i]);
}
//Imprime:
// 25
// 50
// 75
// 100

int myNumbers[4] = {25, 50, 75, 100};
    for (int i = 0; i < 4; i++) {
        printf("%p\n", &myNumbers[i]);
}

//Imprime:
// 0x7ffe70f9d8f0
// 0x7ffe70f9d8f4
// 0x7ffe70f9d8f8
// 0x7ffe70f9d8fc

// Arrajos
// Arrajo de tamanho variável:

#include <stdio.h>
int main()
{
    int n;
    printf("Digite o tamanho do vetor: ");
    scanf("%d", &n);
    int v[n];
    for(int i=0; i<n; i++) {
        printf("Digite um numero: ");
        scanf("%d", &v[i]);
    }
    printf("Imprimindo o vetor: \n");
    for(int i=0; i<n; i++) {
    printf("%d ", v[i]);
    }
}

// Ou

#include <stdio.h>
int main()
{
    int lin, col;
    printf("Digite a quantidade de linhas e colunas da matriz M: ");
    scanf("%d %d", &lin, &col);
    int mat[lin][col];
    printf("Preenchendo a matriz:\n");
    for(int i=0; i<lin; i++) {
        for(int j=0; j < col; j++){
            printf("M(%d,%d)=", i+1, j+1);
            scanf("%d", &mat[i][j]);
        }
    }
    printf("Imprimindo a matriz:\n");
    for(int i=0; i<lin; i++) {
        for(int j=0; j < col; j++){
            printf("%5d", mat[i][j]);
        }
    printf("\n");
    }
}
