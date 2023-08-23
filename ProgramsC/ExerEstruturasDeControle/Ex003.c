#include <stdio.h>
#include <math.h>

int main(int argc, char const *argv[]) {
    double A=4, B=5, C=1;
    double fun1, fun2, fun3 , fun4, fun5;
    fun1 = B * A - pow(B, 2)/4 * C;
    fun2 = (A * B)/pow(3, 2);
    fun3 = (((B + C)/2 * A + 10)* 3 * B) - 6;
    fun4 = 7 * 10 - 50 % 3 * 4 + 9;
    fun5 = (7 *(10 -5) % 3)* 4 + 9;
    printf("Função 1: %f \nFunção 2: %f \nFunção 3: %f \nFunção 4: %f \nFunção 5: %f", fun1, fun2, fun3, fun4, fun5);
    return 0;
}
