#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, b, h, w;
    while(cin >> n >> b >> h >> w) {
        int mn = INT_MAX;
        for(int i = 0; i < h; ++i) {
            int p;
            cin >> p;
            for(int j = 0; j < w; ++j) {
                int t;
                cin >> t;
                if(p*n <= b && t >= n) {
                    mn = min(mn, p*n);
                }
            }
        }
        if(mn == INT_MAX) {
            cout << "stay home\n";
        } else {
            cout << mn << "\n";
        }
    }
    return 0;
}
