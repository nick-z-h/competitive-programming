#include <iostream>

using namespace std;

bool m[1000][1000];
long long N;

bool c(long long x, long long y)
{
    for (long long i = 0; i < N; i++)
    {

        for (long long j = 0; j < N; j++)
        {

            if (i == x || j == y || (x + y) == (i + j) || (x - y) == (i - j))
            {
                if (m[i][j] == 1)
                {
                    return 1;
                }
            }
        }
    }
    return 0;
}

bool q(long long n)
{

    if (n == 0)
    {
        return 1;
    }

    for (long long i = 0; i < N; i++)
    {

        for (long long j = 0; j < N; j++)
        {
            if (c(i, j))
            {
                continue;
            }

            m[i][j] = 1;
            if (q(n - 1))
            {
                return 1;
            }
            m[i][j] = 0;
        }
    }
    return 0;
}

int main()
{
    long long n;
    cin >> n;
    N = n;
    for (long long i = 0; i <= N; i++)
    {
        for (long long j = 0; j <= N; j++)
        {
            m[i][j] = 0;
        }
    }

    if (q(n))
    {
        for (long long i = 0; i < N; i++)
        {
            for (long long j = 0; j < N; j++)
            {
                cout << m[i][j] << " ";
            }
            cout << endl;
        }
    }
    else
    {
        cout << "Not possible\n";
    }
    return 0;
}