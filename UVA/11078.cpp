#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        int n, c, m = -150000;
        cin >> n >> c;
        for(int i = 1; i < n; ++i) {
            int x;
            cin >> x;
            m = max(m, c - x);
            c = max(c, x);
        }
        cout << m << "\n";
    }
    return 0;
}
