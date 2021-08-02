#include <stdio.h>
void main()
{

    int n = 100, s, r, p, m;

    for (n; n <= 999; n++)
    {
        m = n;
        r = 0;

        while (m > 0)
        {

            s = m % 10;
            r = r + s * s * s;
            m = m / 10;
        }

        if (n == r)
        {
            printf(" amstrong no = %d", r);
            printf("\n");
        }
    }
}