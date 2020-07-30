#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    for(int i = 0; i < n; ++i) {
        int m, s;
        cin >> m >> s;
        for(int i = 2; i <= m; ++i) {
            int t;
            cin >> t;
            if(t != s+1) {
                cout << i << "\n";
            } else {
                ++s;
            }
        }

    }
    return 0;
}
