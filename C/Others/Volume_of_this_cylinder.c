#include <stdio.h>

int main()
{
    int radius  ;
    printf("Enter the radius of cylinder = ");
    scanf("%f", &radius);
    float pi = 3.14;
    int height ;
    printf("Enter the hieght of cylinder = ");
    scanf("%f", &height);
    printf("Volume of this cylinder is %f\n", pi * radius * radius * height);
    return 0;
}