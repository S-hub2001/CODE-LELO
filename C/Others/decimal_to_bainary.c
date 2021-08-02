#include <stdio.h>
void main()
{
    int x[100], n, k, i = 0;
    printf("Enter a decimal no = ");
    scanf("%d", &n);

    for (i = 0; n > 0; i++)
    {
        x[i] = n % 2;
        n = n / 2;
    }

    for (i = i - 1; i >= 0; i--)
    {
        printf("%d ", x[i]);
    }
}