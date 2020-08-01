#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int b, n;
    while(cin >> b >> n) {
        if(b == 0 && n == 0) {
            break;
        }
        int r[b];
        for(int i = 0; i < b; ++i) {
            int t;
            cin >> t;
            r[i] = t;
        }
        for(int i = 0; i < n; ++i) {
            int d, c, v;
            cin >> d >> c >> v;
            r[d-1] -= v;
            r[c-1] += v;
        }
        bool f = true;
        for(int i = 0; i < b; ++i) {
            if(r[i] < 0) {
                f = false;
            }
        }
        if(f) {
            cout << "S\n";
        } else {
            cout << "N\n";
        }
    }
    return 0;
}
