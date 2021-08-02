#include <stdio.h>
void main()
{
    int a, b, l;
    printf("Enter the value of a = ");
    scanf(" %d", &a);
    printf("Enter the value of b = ");
    scanf("%d", &b);


for ( l=a>b?a:b ; l<=a*b ; l= l+(a>b?a:b))
     if (l%a==0&&l%b==0)
     break;
     
    printf("LCM is  %d" , l);
}