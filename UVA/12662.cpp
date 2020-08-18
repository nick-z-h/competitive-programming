#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n;
        cin >> n;
        string v[n];
        for (int i = 0; i < n; ++i) {
                cin >> v[i];
        }
        int q;
        cin >> q;
        for (int i = 0; i < q; ++i) {
                int t;
                cin >> t;
                --t;
                int l = t-1, r = t+1;
                int sl = 0, sr = 0;
                while (true) {
                        if (v[t] != "?") {
                                cout << v[t] << "\n";
                                break;
                        }
                        if (l >= 0 && r <=  n-1 && v[l] != "?" && v[r] != "?") {
                                cout << "middle of " << v[l] << " and " << v[r] << "\n";
                                break;
                        }
                        if (l >= 0 && v[l] != "?") {
                                for (int j = 0; j <= sl; ++j) {
                                        cout << "right of ";
                                }
                                cout << v[l] << "\n";
                                break;
                        } else {
                                --l;
                                ++sl;
                        }
                        if (r <= n-1 && v[r] != "?") {
                                for (int j = 0; j <= sr; ++j) {
                                        cout << "left of ";
                                }
                                cout << v[r] << "\n";
                                break;
                        } else {
                                ++r;
                                ++sr;
                        }
                        
                }
        }
        return 0;
}
