#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int l, x;
    cin >> l >> x;
    int c = 0, r = 0;;
    for(int i = 0; i < x; ++i) {
        string s;
        cin >> s;
        int t;
        cin >> t;
        if(s == "enter" && c + t <= l) {
            c += t;
        } else if(s == "leave") {
            c -= t;
        } else {
            ++r;
        }
    }
    cout << r << "\n";
    return 0;
}
