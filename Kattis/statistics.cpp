#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, c = 0;
    while(cin >> n) {
        ++c;
        int m1 = 1000000, m2 = -1000000;
        for(int i = 0; i < n; ++i) {
            int t;
            cin >> t;
            m1 = min(m1, t);
            m2 = max(m2, t);
        }
        cout << "Case " << c << ": " << m1 << " " << m2 << " " << m2 - m1 << "\n";
    }
    return 0;
}
