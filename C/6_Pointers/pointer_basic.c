#include<stdio.h>

int main(){
    int a=6;
    int *ptr;
    ptr = &a;
    printf("The value of variable a is %d\n", a);
    printf("The address of variable a is %u\n", ptr);
    printf("The value of variable a is %d\n", *ptr);
    return 0;
}


#include<stdio.h>

int main(){
    int i = 345;
    int *ptr;
    int **ptr_ptr;

    ptr = &i;
    ptr_ptr= &ptr;

    printf("The value of i is %d", **ptr_ptr);
    return 0;
}