#include <bits/stdc++.h>

using namespace std;

int mat[21][21];
int k[21][21];

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int h, w, n, m;
        cin >> h >> w >> n >> m;
        for (int i = 0; i < h; ++i) {
                for (int j = 0; j < w; ++j) {
                        cin >> mat[i][j];
                }
        }
        for (int i = n-1; i >= 0; --i) {
                for (int j = m-1; j >= 0; --j) {
                        cin >> k[i][j];
                }
        }
        int res[h-n+1][w-m+1];
        for (int i = 0; i <= h-n; ++i) {
                for (int j = 0; j <= w-m; ++j) {
                        int s = 0;
                        for (int g = 0; g < n; ++g) {
                                for (int l = 0; l < m; ++l) {
                                       s += mat[i+g][j+l]*k[g][l];
                                }
                        }
                        res[i][j] = s;
                }
        }
        for (int i = 0; i < h-n+1; ++i) {
                for (int j = 0; j < w-m+1; ++j) {
                        cout << res[i][j] << " ";
                }
                cout << "\n";
        }
        return 0;
}
