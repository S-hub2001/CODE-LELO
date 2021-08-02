#include <stdio.h>

int main()
{
    int n, i, c = 0;
    printf("Enter the number = ");
    scanf(" %d", &n);

    for (i = 2; i <= n / 2; i++)
    {
        if (n % i == 0)
        {
            c = 1;
            break;
        }
    }

    if (c == 0)
    {
        printf("%d is a prime ", n);
    }
    else
    {
        printf("%d is a not prime ", n);
    }

    return 0;
}