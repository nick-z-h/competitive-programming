#include <iostream>
using namespace std;

int main()
{
    int n, r = 0, o = 0, y = 0, g = 0, bl = 0, bk = 0, m = 0;
    cin >> n;
    for (int i = 0; i < n; ++i)
    {
        string s;
        cin >> s;
        if (s == "red")
        {
            m = max(m, ++r);
        }
        if (s == "orange")
        {
            m = max(m, ++o);
        }
        if (s == "yellow")
        {
            m = max(m, ++y);
        }
        if (s == "green")
        {
            m = max(m, ++g);
        }
        if (s == "blue")
        {
            m = max(m, ++bl);
        }
        if (s == "black")
        {
            m = max(m, ++bk);
        }
    }
    if (m * 2 - 1 <= r + o + y + g + bl + bk)
    {
        cout << r + o + y + g + bl + bk << "\n";
    }
    else
    {
        cout << ((r + o + y + g + bl + bk - m)*2+1) << "\n";
    }
    return 0;
}