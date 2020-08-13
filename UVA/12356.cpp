#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int s, b;
        while (cin >> s >> b && s && b) {
                int l[s+1];
                int r[s+1];
                for (int i = 1; i <= s; ++i) {
                        l[i] = i - 1;
                        r[i] = i + 1;
                }
                for (int i = 0; i < b; ++i) {
                        int x, y;
                        cin >> x >> y;
                        if (l[x] >= 1) {
                                cout << l[x] << " ";
                        } else {
                                cout << "* ";
                        }
                        if (r[y] <= s) {
                                cout << r[y] << "\n";
                        } else {
                                cout << "*\n";
                        }
                        l[r[y]] = l[x];
                        r[l[x]] = r[y];
                }
                cout << "-\n";
        }
        return 0;
}
