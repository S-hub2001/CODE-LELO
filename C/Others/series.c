#include <stdio.h>
#include <math.h>
void main()
{
    int n , i, x;
    float s = 0.0;
    printf("Enter the value of n = ");
    scanf("%d", &n);
    printf("Enter the value of x = ");
    scanf("%d", &x);

    for (i = 1; i <= n; i++)
    {
        // 1/x + 2/x2 + 3/x3
        s = s + i / pow(x, i);
    }

    printf("Result= %f", s);
}