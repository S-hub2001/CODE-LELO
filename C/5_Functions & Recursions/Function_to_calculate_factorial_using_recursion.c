#include <stdio.h>

int td(int x);

int main()
{
    int n;
    printf("Enter the number = ");
    scanf("%d", &n);

    int p = td(n);

    printf(" factorial =  %d", p);
    return 0;
}

// Function to calculate factorial using recursion

int td(int x)
{
    int f;
    if (x == 0 || x == 1)
        return 1;
    else
        f = x * td(x - 1);

    // f= 5 x 4 x 3 x 2 x 1

    return f;
}

// int td(int  n){

//   int  i = 1, factorial=1;
//     while (i <= n)
//     {

//         factorial = factorial * i;

//         i++;
//     }
//      return factorial;

// }
