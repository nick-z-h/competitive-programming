#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    for(int i = 1; i <= n; ++i) {
        int m, c = 0;
        cin >> m;
        for(int j = 0; j < m; ++j) {
            int t;
            cin >> t;
            c = max(c, t);
        }
        cout << "Case " << i << ": " << c << "\n";
    }
    return 0;
}
