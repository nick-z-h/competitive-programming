#include <iostream>
#include <algorithm>

using namespace std;

int a[1000];
int main()
{
    int n;
    cin >> n;
    for (int i = 0; i < n; ++i)
    {
        cin >> a[i];
    }
    sort(a, a + n);
    int start = a[0], end = start;
    for (int i = 1; i < n; ++i)
    {
        if (a[i] == a[i - 1] + 1)
        {
            end = a[i];
        }
        else
        {
            if (start == end)
            {
                cout << start;
            }
            else if (start == end - 1)
            {
                cout << start << " " << end;
            }
            else
            {
                cout << start << "-" << end;
            }
            cout << " ";
            start = a[i];
            end = start;
        }
    }
    if (start == end)
    {
        cout << start;
    }
    else if (start == end - 1)
    {
        cout << start << " " << end;
    }
    else
    {
        cout << start << "-" << end;
    }
    return 0;
}