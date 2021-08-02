#include <stdio.h>
void main()
{
    int n, x, r = 0;

    printf("Enter a posative no = ");

    scanf("%d", &n);

    while (n != 0)
    {
        x = n % 10;
        r = r * 10 + x;
        n = n / 10;
    }

    printf("Revarce of this no is = %d ", r);
}