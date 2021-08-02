// #include <stdio.h>

// int main()
// {

//     int sum = 0, i = 0;

//     while (i <=10)
//     {

//         sum = sum + i;

//         i++;
//     }

//     printf("Sum is = %d ", sum);

//     return 0;
// }

#include <stdio.h>

int main()
{
    int i = 1, sum = 0;

    do
    {
        sum += i;

        i++;
    } while (i <= 10);

    printf("%d", sum);

    return 0;
}