/*
  Discrete Mathematics and It's Applications
  By Kenneth H. Rosen
  
  Chapter 5.3 Recursive Definitions and Structural Inductions
  Solution 1 by Rakesh Kumar (cpp.rakesh(at)gmail.com)
  Date: 06/07/2017
 */

#include <cstdio>

int pow(int x, int y) {
    if (y == 0) {
        return 1;
    } else if (y == 1) {
        return x;
    } else {
        const int t = pow(x, y >> 1);
        if (y % 2)
            return x * t * t;
        else
            return t * t;
    }
}

// Basic     Step f(0)     = 1
// Recursive Step f(n + 1) = f(n) + 2
int a(int n) {
    if (n == 0)
        return 1;
    else
        return a(n - 1) + 2;
}

// Basic     Step f(0)     = 1
// Recursive Step f(n + 1) = 3f(n)
int b(int n) {
    if (n == 0)
        return 1;
    else
        return 3 * b(n - 1);
}

// Basic     Step f(0)     = 1
// Recursive Step f(n + 1) = 2 ^ f(n)
int c(int n) {
    if (n == 0)
        return 1;
    else
        return pow(2, c(n - 1));
}

// Basic     Step f(0)     = 1
// Recursive Step f(n + 1) = f(n) ^ 2 + f(n) + 1
int d(int n) {
    if (n == 0)
        return 1;
    else
        return d(n - 1) * d(n - 1) + d(n - 1) + 1;
}

void test() {
    const int max = 5;
    printf("----- f(n + 1) = f(n) + 2 -------\n");
    for (int n = 0; n < max; ++n)
        printf("a(%2d) == [%8d]\n", n, a(n));
    printf("---------------------------------\n");

    printf("----- f(n + 1) = 3 * f(n) -------\n");
    for (int n = 0; n < max; ++n)
        printf("b(%2d) == [%8d]\n", n, b(n));
    printf("---------------------------------\n");

    printf("----- f(n + 1) = 2 ^ f(n) -------\n");
    for (int n = 0; n < max; ++n)
        printf("c(%2d) == [%8d]\n", n, c(n));
    printf("---------------------------------\n");

    printf("-- f(n + 1) = f(n) ^ 2 + f(n) + 1\n");
    for (int n = 0; n < max; ++n)
        printf("d(%2d) == [%8d]\n", n, d(n));
    printf("---------------------------------\n");     
}

int main() {
    test();

    return 0;
}
