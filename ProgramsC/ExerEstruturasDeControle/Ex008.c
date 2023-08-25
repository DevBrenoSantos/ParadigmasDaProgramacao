#include <stdio.h>

int main(int argc, char const *argv[]) {
    float baseMaior, baseMenor, altura, area;
    printf("Insira o valor da base maior: ");
    scanf("%f", &baseMaior);
    printf("Insira o valor da base menor: ");
    scanf("%f", &baseMenor);
    printf("Insira a altura do trapézio: ");
    scanf("%f", &altura);
    area = ((baseMaior + baseMenor) * altura)/2;
    printf("A área doo trapézio é: %2.f", area);
    return 0;
}
