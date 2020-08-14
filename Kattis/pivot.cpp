#include <bits/stdc++.h>

using namespace std;

int a[100000];
int b[100000];
int c[100000];

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n;
        cin >> n >> a[0];
        b[0] = a[0];
        for (int i = 1; i < n; ++i) {
                cin >> a[i];
                b[i] = max(a[i], b[i-1]);
        }
        c[n-1] = a[n-1];
        for (int i = n-2; i >= 0; --i) {
                c[i] = min(a[i], c[i+1]);
        }
        int r = 0;
        for (int i = 0; i < n; ++i) {
                if (a[i] >= b[i] && a[i] <= c[i]) {
                        ++r;
                }
        }
        cout << r << "\n";
        return 0;
}
