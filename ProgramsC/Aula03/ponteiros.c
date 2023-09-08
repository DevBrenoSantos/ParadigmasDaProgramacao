#include <stdio.h>

int main()
{
    // int myNumbers[4] = {25, 50, 75, 100};
    int myNumbers[4];
    int *ptr = myNumbers;

    // printf("end ptr: %p\n", ptr);
    // printf("end myNumbers: %p\n", &myNumbers);
    // printf("end myNumbers: %p\n", &myNumbers[0]);

    for (int i = 0; i < 4; i++) {
        printf("End de myNumbers[%d] = %p\n", i, ptr + i);
    }

    for (int i = 0; i < 4; i++ ) {
        scanf("%d", ptr + i);
    }

    // for (int i = 0; i < 4; i++ ) {
    //     printf("%d ", myNumbers[i]);
    // }

    for (int i = 0; i < 4; i++ ) {
        printf("%d ", *(ptr + i));
    }
    return 0;
}
