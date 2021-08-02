#include<stdio.h>
int main(){
    float pi=3.14,radius,height;
   printf("Enter the radius =");
    scanf("%f",&radius);
    printf("Enter the height =");
    scanf("%f",&height);
    printf("Area of cylinder =%.2f",pi*radius*radius*height);
    return 0;
}