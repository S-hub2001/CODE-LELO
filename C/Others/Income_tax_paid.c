#include <stdio.h>

int main()
{
    float tex = 0, income;
    printf("Enter the income \n");
    scanf("%f", &income);

    if (income >= 250000 && income <= 500000)
    {
        tex = tex + 0.05 * (income - 250000);
    }

    else if (income >= 500000 && income <= 1000000)
    {
        tex = tex + 0.20 * (income - 500000);
    }

    else if (income >= 1000000)
    {
        tex = tex + 0.30 * (income - 1000000);
    }
    printf("Income tax paid by an employee to the government as per the slabs =%f", tex);

    return 0;
}