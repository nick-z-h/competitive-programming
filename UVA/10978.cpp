#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n;
        while (cin >> n && n) {
                int c = 0;
                string r[n];
                for (int i = 0; i < n; ++i) {
                        string a, b;
                        cin >> a >> b;
                        while (!b.empty()) {
                                if (r[c] == "") {
                                        b.pop_back();
                                }
                                ++c;
                                c %= n;
                        }
                        r[(c - 1 + n) % n] = a; 
                }
                for (int i = 0; i < n; ++i) {
                        if (i) {
                                cout << " ";
                        }
                        cout << r[i];
                        
                }
                cout << "\n";
        }
        return 0;
}
