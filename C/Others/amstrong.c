#include <stdio.h>
int main()
{
    int n, r, sum = 0, temp;

    int l ;
    printf("enter the number=");
    scanf("%d", &n);
    printf("enter the number of lenth=");
    scanf("%d", &l);
    temp = n;
    
    while (n > 0)
    {
        r = n % 10;
         int p = 1;
        for (int i = 0; i < l; i++)
        {
            p = p * r;
        }
        sum = sum + (p);
        n = n / 10;
    }



    
    if (temp == sum)
        printf("armstrong  number ");
    else
        printf("not armstrong number");
    return 0;
}