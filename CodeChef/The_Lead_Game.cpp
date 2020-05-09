#include <iostream>

using namespace std;

int main()
{
    int n, winner, md = 0, p1 = 0, p2 = 0;
    cin >> n;
    for (int i = 0; i < n; ++i)
    {
        int a, b;
        cin >> a >> b;
        p1 += a;
        p2 += b;
        if (abs(p1 - p2) > md)
        {
            md = abs(p1 - p2);
            if (p1 - p2 > 0)
            {
                winner = 1;
            }
            else
            {
                winner = 2;
            }
        }
    }
    cout << winner << " " << md << "\n";
    return 0;
}