#include <stdio.h>

int main()
{
    int radius  ;
    printf("Enter the radius of circle = ");
    scanf("%f", &radius);
    float pi = 3.14;
    printf("The area of this circle is %f\n", pi * radius * radius);

    return 0;
}