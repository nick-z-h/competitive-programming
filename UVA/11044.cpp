#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        int x, y;
        cin >> x >> y;
        cout << (x/3)*(y/3) << "\n";
    }
    return 0;
}