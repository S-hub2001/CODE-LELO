#include <stdio.h>
void main()
{
    int n, s, r = 0;

    printf("Enter a number = ");

    scanf("%d", &n);

    int p = n;

    while (n != 0)
    {
        s = n % 10;
        r = r * 10 + s;
        n = n / 10;
    }

    if (r == p)
    {
        printf("Number is palindrom ");
    }
    else
    {
        printf("Number is not palindrom ");
    }
}