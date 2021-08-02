#include <stdio.h>

int main()
{
    int n;
    printf("Ener 1st number ");
    scanf("%d", &n);
    if (n % 2 == 0)
    {
        printf("%d is even.", n);
    }
    else
    {
        printf("%d is odd.", n);
    }
    return 0;
}