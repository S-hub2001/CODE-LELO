#include <stdio.h>

int main()
{
    int n, i, factorial = 1;
    printf("Enter the number = ");
    scanf("%d", &n);

    // for (i = 1; i <= n; i++)
    // {
    //     factorial=factorial*i;
    // }

    i = 1;
    while (i <= n)
    {

        factorial = factorial * i;

        i++;
    }

    printf(" factorial =  %d", factorial);
    return 0;
}