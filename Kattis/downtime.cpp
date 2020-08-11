#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n, k;
        cin >> n >> k;
        vector<int> v;
        for (int i = 0; i < n; ++i) {
                int t;
                cin >> t;
                v.push_back(t);
                if (t - v[0] >= 1000) {
                        v.erase(v.begin());
                }
        }
        cout << ceil((double)v.size()/(double)k) << "\n";
        return 0;
}
