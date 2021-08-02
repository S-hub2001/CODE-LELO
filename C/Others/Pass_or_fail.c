#include <stdio.h>

int main()
{
    int a, b, c, av;

    printf("Enter the number subject ENG = ");
    scanf("%d", &a);
    printf("Enter the number subject BEN= ");
    scanf("%d", &b);
    printf("Enter the number subject GEO = ");
    scanf("%d", &c);

    av = (a + b + c) / 3;
    printf("Your Avarage mark = %d \n", av);


    printf("Need Avarage 40 and also need 33 par subject for pass\n");



    if (av > 40 && a > 33 && b > 33 && c > 33)
    {
        printf("YOU ARE PASS");
    }
    else
    {
        printf("Faill!");
    }

    return 0;
}