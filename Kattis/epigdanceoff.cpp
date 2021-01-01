#include <bits/stdc++.h>

using namespace std;

bool mat[2001][2001];

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n, m;
        cin >> n >> m;
        for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                        char t;
                        cin >> t;
                        if (t == '$') {
                                mat[i][j] = true;
                        }
                }
        }
        int c = 1;
        for (int i = 0; i < m; ++i) {
                bool f = true;
                for (int j = 0; j < n; ++j) {
                        if (mat[j][i]) {
                                f = false;
                        }
                }
                if (f) {
                        ++c;
                }
        }
        cout << c << "\n";
        return 0;
}
