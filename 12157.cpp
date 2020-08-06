#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int j = 0; j < t; ++j) {
        int n, a = 0, b = 0;
        cin >> n;
        for(int i = 0; i < n; ++i) {
            int t;
            cin >> t;
            a += t/30 + 1;
            b += t/60 + 1;
        }
        a *= 10;
        b *= 15;
        if(a < b) {
            cout << "Case " << j+1 << ": Mile " << a << "\n";
        } else if(a > b) {
            cout << "Case " << j+1 << ": Juice " << b << "\n";
        } else {
            cout << "Case " << j+1 << ": Mile Juice " << a << "\n";
        }
    }
    return 0;
}
