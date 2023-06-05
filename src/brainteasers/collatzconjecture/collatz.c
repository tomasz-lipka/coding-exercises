/** How many steps will it take to transform a positive integer into 1?
 * Given:
 * If the number is even, divide it by two.
 * If the number is odd, triple it and add one
 */
#include <stdio.h>
#include <stdbool.h>

int collatz_steps(int n);
bool is_even(int n);

int main(void)
{
    // Expected: 0
    printf("%i\n", collatz_steps(1));

    // Expected: 1
    printf("%i\n", collatz_steps(2));

    // Expected: 7
    printf("%i\n", collatz_steps(3));

    // Expected: 2
    printf("%i\n", collatz_steps(4));

    // Expected: 5
    printf("%i\n", collatz_steps(5));

    return 0;
}

int collatz_steps(int n)
{
    if (n == 1)
        return 0;
    else if (is_even(n))
        return 1 + collatz_steps(n / 2);
    else
        return 1 + collatz_steps(3 * n + 1);
}

bool is_even(int n)
{
    return n % 2 == 0;
}
