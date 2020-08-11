#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n;
        cin >> n;
        vector<int> v(1);
        cin >> v[0];
        int c = v[0];
        for (int i = 1; i < n; ++i) {
                int t;
                cin >> t;
                if (t > c) {
                        c = t;
                        v.push_back(t);
                }
        }
        cout << v.size() << "\n";
        for (auto &x : v) {
                cout << x << " ";
        }
        cout << "\n";
        return 0;
}
