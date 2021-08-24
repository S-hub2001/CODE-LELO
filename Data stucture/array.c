#include <stdio.h>
void display(int arry[], int n)
{
    for (int i = 0; i <= n - 1; i++)
    {
        printf("%d ", arry[i]);
    }
    printf("\n");
}
int insert(int arry[], int lenth, int size, int eliment, int inde)
{
    if (size >= lenth)
    {
        return -1;
    }
    int index=inde-1;
    for (int i = size - 1; i >= index; i--)
    {
        arry[i + 1] = arry[i];
    }
    arry[index] = eliment;
    return 1;
}

int delete (int arry[], int size, int index)
{
    for (int i = index - 1; i <= size; i++)
    {
        arry[i] = arry[i + 1];
    }
}

void main()
{
    int arr[50] = {10, 20, 30, 40, 50};
    int size = 5, eliment = 90, index = 3;
    display(arr, size);
    insert(arr, 50, size, eliment, index);
    size = size + 1;
    display(arr, size);
    delete (arr, size, index);
    size = size - 1;
    display(arr, size);
}