#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char const *argv[]) {
    float vet[5], vet2[5], media;
    int ni1, ni2, ni3, ni4, ni5;
        srand(time(NULL));
    for (int aux=0; aux<5; aux++) {
        vet[aux] = rand() % 100;
    }
    for (int aux=0; aux<5; aux++) {
        printf("%2.f\n", vet[aux]);
    }

    for (int aux=0; aux<5; aux++) {
        vet2[aux] = round(vet[aux]);
    }

    media = (vet2[0] + vet2[1] + vet2[2] + vet2[3] + vet2[4])/5;
    printf("Média: %f", media);
    return 0;
}