#include <stdio.h>
void kutta(int a, int b, int c, int d);

int main()
{
    int a, b, c, d;
    printf("Enter the Four Numbers :");
    scanf("%d %d %d %d", &a, &b, &c, &d);

    kutta(a, b, c, d);

    return 0;
}

void kutta(int a, int b, int c, int d)
{

    if (a > b)
    {
        if (a > c)
        {
            if (a > d)
            {
                printf("%d is big", a);
            }
            else
            {
                printf("%d is big", d);
            }
        }
    }

    else if (b > c)
    {
        if (b > d)
        {
            printf("%d is big", b);
        }
        else
        {
            printf("%d is big", d);
        }
    }
    else if (c > d)
    {
        printf("%d is big", c);
    }
    else
    {
        printf("%d is big", d);
        }
}