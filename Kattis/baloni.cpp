#include <bits/stdc++.h>

using namespace std;

int a[1000010];
int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n;
        cin >> n;
        for (int i = 0; i < n; ++i) {
                int t;
                cin >> t;
                if (a[t] == 0) {
                        ++a[t-1];
                } else {
                        --a[t];
                        ++a[t-1];
                }
        }
        int r = 0;
        for(int i = 0; i < 1000010; ++i) {
                r += a[i];
        }
        cout << r << "\n";
        return 0;
}
