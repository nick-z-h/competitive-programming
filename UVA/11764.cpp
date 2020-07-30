#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int i = 1; i <= t; ++i) {
        int n, s, h = 0, l = 0;
        cin >> n >> s;
        for(int i = 1; i < n; ++i) {
            int c;
            cin >> c;
            if(c < s) {
                ++l;
            } else if(c > s) {
                ++h;
            }
            s = c;
        }
        cout << "Case " << i << ": " << h << " " << l << "\n";
    }
    return 0;
}
