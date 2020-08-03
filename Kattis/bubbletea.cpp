#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    int p[n];
    for(int i = 0; i < n; ++i) {
        int t;
        cin >> t;
        p[i] = t;
    }
    int m;
    cin >> m;
    int tp[m];
    for(int i = 0; i < m; ++i) {
        int t;
        cin >> t;
        tp[i] = t;
    }
    int pr = 100000;
    for(int i = 0; i < n; ++i) {
        int k;
        cin >> k;
        for(int j = 0; j < k; ++j) {
            int t;
            cin >> t;
            pr = min(pr, p[i] + tp[t-1]);
        }
    }
    int x;
    cin >> x;
    int tol = x/pr -1;
    if(tol > 0) {
        cout << tol << "\n";
    } else {
        cout << 0 << "\n";
    }
    return 0;
}
