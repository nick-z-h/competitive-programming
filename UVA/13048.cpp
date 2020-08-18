#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int t;
        cin >> t;
        for (int g = 1; g <= t; ++g) {
                string s;
                cin >> s;
                vector<bool> v(s.size(), true);
                for (int i = 0; i < s.size(); ++i) {
                        if (s[i] == 'D') {
                                v[i] = false;
                        } else if (s[i] == 'B') {
                                v[i] = false;
                                if (i > 0) {
                                        v[i-1] = false;
                                }
                                if (i > 1) {
                                        v[i-2] = false;
                                }
                        } else if (s[i] == 'S') {
                                v[i] = false;
                                if (i > 0) {
                                        v[i-1] = false;
                                }
                                if (i < s.size() - 1) {
                                        v[i+1] = false;
                                }
                        }
                }
                int c = 0;
                for (auto x : v) {
                        if (x) {
                                ++c;
                        }
                }
                cout << "Case " << g << ": " << c << "\n";
        }
        return 0;
}
