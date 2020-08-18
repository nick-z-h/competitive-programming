#include <bits/stdc++.h>

using namespace std;


int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int t;
        cin >> t;
        for (int j = 1; j <= t; ++j) {
                vector<bool> a(100005);
                vector<bool> b(100005);
                vector<bool> c(100005);
                int ca = 0, cb = 0, cc = 0;
                int n;
                cin >> n;
                for (int i = 0; i < n; ++i) {
                        int x;
                        cin >> x;
                        a[x] = true;
                }
                cin >> n;
                for (int i = 0; i < n; ++i) {
                        int x;
                        cin >> x;
                        b[x] = true;
                }
                cin >> n;
                for (int i = 0; i < n; ++i) {
                        int x;
                        cin >> x;
                        c[x] = true;
                }
                for (int i = 0; i < 100001; ++i) {
                        if (a[i] && !b[i] && !c[i]) {
                                ++ca;
                        }
                        if (b[i] && !a[i] && !c[i]) {
                                ++cb;
                        }
                        if (c[i] && !a[i] && !b[i]) {
                                ++cc;
                        }
                }
                int mx = max(ca, max(cb, cc));
                cout << "Case #" << j << ":\n";
                if (ca == mx) {
                        cout << 1 << " " << ca;
                        for (int i = 0; i < 100001; ++i) {
                                if (a[i] && !b[i] && !c[i]) {
                                        cout << " " << i;
                                }
                        }
                        cout << "\n";
                }
                if (cb == mx) {
                        cout << 2 << " " << cb;
                        for (int i = 0; i < 100001; ++i) {
                                if (b[i] && !a[i] && !c[i]) {
                                        cout << " " << i;
                                }
                        }
                        cout << "\n";
                }
                if (cc == mx) {
                        cout << 3 << " " << cc;
                        for (int i = 0; i < 100001; ++i) {
                                if (c[i] && !a[i] && !b[i]) {
                                        cout << " " << i;
                                }
                        }
                        cout << "\n";
                }
        }
        return 0;
}
