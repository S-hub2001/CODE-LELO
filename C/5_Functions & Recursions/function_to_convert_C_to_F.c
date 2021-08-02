#include <stdio.h>

int celcius(int c);

int main()
{
    int cel;
    printf("Celcius temparature is \n");
    scanf("%d", &cel);
    printf("result =%d ", celcius(cel));
    return 0;
}

int celcius(int c)
{
    float f;
    f = (c * 9 / 5) + 32;
    return f;
}