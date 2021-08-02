#include <stdio.h>

int main()
{
    int n, i;
    printf("Enter The Number = ");
    scanf("%d", &n);
    int sum = 0;
    for (int i = 1; i <= 10; i++)
    {
        printf("%d x %d= %d \n ", n, i, n * i);

        sum = sum + (n * i);
    }

    printf("Sum of table =%d", sum);

    // //  reversed order

    // for (i = 10; i ; i--)
    // {

    // printf("%d x %d= %d \n ", n,i,  n*i  );

    // }

    return 0;
}
