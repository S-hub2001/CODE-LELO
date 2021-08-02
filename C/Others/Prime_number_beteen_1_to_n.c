#include <stdio.h>
void main()
{
    int n, m, count , i, j;

    printf("Enter a number = ");
    scanf("%d", &m);

    for (j = 1; j <= m; j++)
    {
        count = 0;
        for (i = 1; i <= m; i++)
        {
            if (j % i == 0)
            {
                count++;
            }
        }

        if (count == 2)
        {
            printf(" The number is prime = %d ", j);
            printf("\n");

        }
    }
}