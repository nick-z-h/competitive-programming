#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        string s;
        while (cin >> s) {
                int c = 0, p = -1;
                for (int i = 0; i < s.size(); ++i) {
                        if (s[i] == 'X') {
                                if (p == -1) {
                                        c = max(c, i - 1);
                                } else {
                                        c = max(c, (i - p - 2)/2);
                                }
                                p = i;
                        }
                }
                int n = s.size() - 1;
                c = max(c, n - p - 1);
                cout << c << "\n";
        }
        return 0;
}
