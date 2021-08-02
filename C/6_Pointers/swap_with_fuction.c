

#include <stdio.h>

// int main()
// {
//     int a = 10, b = 20;

//     printf("Befor  Swaping :\n");
//     printf("value of a = %d\n", a);
//     printf("value of b = %d\n", b);

//     int c;

//     c = a;
//     a = b;
//     b = c;
//     printf("After Swaping : \n");
//     printf("value of a = %d\n", a);
//     printf("value of b = %d\n", b);

//     return 0;
// }

void swap(int *x, int *y);

int main()
{
    int a = 10, b = 20;

    printf("Befor  Swaping :\n");
    printf("value of a = %d\n", a);
    printf("value of b = %d\n", b);

    swap(&a, &b);

    // printf("Befor  Swaping :\n");
    // printf("value of a = %d\n", a);
    // printf("value of b = %d\n", b);

    printf("value of a = %d\n", a);
    printf("value of b = %d\n", b);

    return 0;
}

// void swp(int a, int b)
// {
//     int c;

//     c = a;
//     a = b;
//     b = c;


    
//     // printf("After Swaping : \n");
//     // printf("value of a = %d\n", a);
//     // printf("value of b = %d\n", b);
// }

void swap(int *x, int *y)
{
int temp;
temp= *x;
*x = *y;
*y = temp;
}


