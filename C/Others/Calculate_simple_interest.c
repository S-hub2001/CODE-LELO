#include <stdio.h>

int main()
{
    int p, rate, time, si;
    printf("Enter your principle ammount ");
    scanf("%d", &p);
    printf("Enter your rate of interestt ");
    scanf("%d", &rate);
    printf("Enter your time of the year ");
    scanf("%d", &time);
    si = (p * rate * time) / 100;
    printf("Simple INterest %d", si);

    return 0;
}