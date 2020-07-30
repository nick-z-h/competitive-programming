#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    for(int i = 0; i < n; ++i) {
        int l, w, h;
        cin >> l >> w >> h;
        cout << "Case " << i+1 << ": ";
        if(l <= 20 && w <= 20 && h <= 20) {
            cout << "good\n";
        } else {
            cout << "bad\n";
        }
    }
    return 0;
}
