#include <stdio.h>
void main()
{
    int a, b, t;
    printf("Enter the value of a = ");
    scanf(" %d", &a);
    printf("Enter the value of b = ");
    scanf("%d", &b);

    if ((a % b) == 0)
    {
        goto abc;
    }

    while ((a % b) != 0)
    {
        t = a % b;
        a = b;
        b = t;
    }

    abc:

    printf("The GCD of The given numbers is %d" , b );


}