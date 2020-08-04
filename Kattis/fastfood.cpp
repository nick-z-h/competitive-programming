#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        int n, m;
        cin >> n >> m;
        vector< vector < int > > v(n);
        vector < int > p;
        for(int j = 0; j < n; ++j) {
            int k;
            cin >> k;
            for(int g = 0; g < k; ++g) {
                int x;
                cin >> x;
                v[j].push_back(x);
            }
            int tp;
            cin >> tp;
            p.push_back(tp);
        }
        int ts[m], c = 0;
        for(int j = 0; j < m; ++j) {
            cin >> ts[j];
        }
        for(int j = 0; j < n; ++j) {
            int mn = 101;
            for(int g = 0; g < v[j].size(); ++g) {
                mn = min(mn, ts[v[j][g]-1]);
            }
            c += mn * p[j];
        }
        cout << c << "\n";
    }
    return 0;
}
