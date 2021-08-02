#include <stdio.h>

void kutta(int k, int m, int n);

int main()
{
    int a, b, c;

    printf("Enter the number's =  \n");
    scanf("%d %d %d", &a, &b, &c);

    kutta(a, b, c);

    return 0;
}

void kutta(int k, int m, int n)
{

    float av = (k + m + n) / 3;

    printf("Average = %f", av);
}