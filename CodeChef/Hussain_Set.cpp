#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, m, c = 1;
    cin >> n;
    cin >> m;

    long long a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    queue<long long> q1, q2;
    sort(a, a + n);

    for (int i = n - 1; i >= 0; i--)
    {
        q1.push(a[i]);
    }

    while (m--)
    {
        int t;
        long long ans;
        cin >> t;
        for (; c <= t; c++)
        {
            if (q1.front() >= q2.front())
            {
                ans = q1.front();
                q1.pop();
            }
            else
            {
                ans = q2.front();
                q2.pop();
            }
            q2.push(ans >> 1);
        }
        cout << ans << "\n";
    }
}