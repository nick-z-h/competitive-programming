#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t, c = 0;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        double x, y, z, w;
        cin >> x >> y >> z >> w;
        if((x + y + z <= 125 || (x <= 56 && y <= 45 && z <= 25)) && w <= 7) {
            cout << 1 << "\n";
            ++c;
        } else {
            cout << 0 << "\n";
        }
    }
    cout << c << "\n";
    return 0;
}
