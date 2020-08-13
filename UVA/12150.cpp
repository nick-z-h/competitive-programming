#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n;
        while (cin >> n && n) {
                bool f = true;
                vector<int> a(n);
                for (int i = 0; i < n; ++i) {
                        int x, y;
                        cin >> x >> y;
                        if (i + y >= n || i + y < 0) {
                                f = false;
                                continue;
                        }
                        if (a[i+y]) {
                                f = false;
                                continue;
                        }
                        a[i+y] = x;
                }
                if (!f) {
                        cout << -1 << "\n";
                } else {
                        cout << a[0];
                        for (int i = 1; i < n; ++i) {
                                cout << " " << a[i];
                        }
                        cout << "\n";
                }
        }
        return 0;
}
