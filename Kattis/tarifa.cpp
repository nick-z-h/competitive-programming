#include <bits/stdc++.h>

using namespace std;

int main() {
        ios::sync_with_stdio(0);
        cin.tie(0);
        int x, n, t = 0;
        cin >> x >> n;
        for(int i = 0; i < n; ++i) {
                int a;
                cin >> a;
                t += x-a;
        }
        cout << t + x << "\n";
        return 0;
}
