#include <stdio.h>
void main()
{
    long int n, c = 0;

abc:
    printf("Enter a posative  number = ");
    scanf("%ld", &n);

    if (n < 0)
    {
        printf(" Wrong input try again - ");
        goto abc;
    }
    while (n != 0)
    {
        n = n / 10;
        c = c + 1;
    }

    printf(" The number of digit in this posative number  = %ld ", c);
}