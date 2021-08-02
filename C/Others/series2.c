#include <stdio.h>
#include <math.h>
void main()
{
    int n, x, i;
    float s = 0.0;
    printf("Enter the value of n = ");
    scanf("%d", &n);
    printf("Enter the value of x = ");
    scanf("%d", &x);

    for (i = 1; i <=n; i++)
    {
        // x/1+x2/2+x3/3
        s = s + pow(x, i) / i;
    }

    printf("Result =%f", s);
}