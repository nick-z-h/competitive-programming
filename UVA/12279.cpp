#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, c = 0;
    while(cin >> n) {
        if(n == 0) {
            break;
        }
        ++c;
        int a = 0, b = 0;
        for(int i = 0; i < n; ++i) {
            int t;
            cin >> t;
            if(t == 0) {
                ++b;
            } else {
                ++a;
            }
        }
        cout << "Case " << c << ": " << a - b << "\n";
    }
    return 0;
}
