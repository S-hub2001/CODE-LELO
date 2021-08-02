// #include <stdio.h>
// void main()
// {
//     int n, count = 0, i;

//     printf("Enter a number = ");
//     scanf("%d", &n);

//     for (i = 1; i <= n; i++)
//     {
//         if (n % i == 0)
//         {
//             count++;
//         }
//     }

//     if (count == 2)
//     {
//         printf(" The number is prime ");
//     }
//     else
//     {
//         printf("The number is not prime ");
//     }
// }



#include<stdio.h>

int main(){
    // Prime Numbers = A prime number (or a prime) is a natural number greater than 1 that is not a product of two smaller natural numbers. 
    // Disclaimer: This is not the best method to solve this problem
    int n = 2, prime=1;
    for(int i=2;i<n;i++){
        if (n%i==0 ){
            prime = 0;
            break;
        }
    }
    if (prime==0){
        printf("This is not a prime number");
    }
    else{
        printf("This is a prime number");
    }
    return 0;
}