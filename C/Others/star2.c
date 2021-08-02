#include <stdio.h>

void main()
{
    int n = 5;
    for (int i = 5; i > 0; i--)
    {

        for (int k = 0; k < n - i; k++)
        {
            printf(" ");
        }

        for (int j = 0; j < i; j++)
        {

            printf("* ");
        }
        printf("\n");
    }
}