#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n;
        while (cin >> n) {
                long long a[n];
                bool b[n];
                for (int i = 0; i < n; ++i) {
                        cin >> a[i];
                        b[i] = false;
                }
                for (int i = 1; i < n; ++i) {
                        long long d = abs(a[i] - a[i-1]);
                        if (d < n) {
                                b[d] = true;
                        }
                }
                bool f = true;
                for (int i = 1; i < n; ++i) {
                        f &= b[i];
                } 
                if (f) {
                        cout << "Jolly\n";
                } else {
                        cout << "Not jolly\n";
                }
        }
        return 0;
}
