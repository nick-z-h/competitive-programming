#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        string s;
        int c = 0, st = 0;
        cin >> s;
        for(int i = 0; i < s.size(); ++i) {
            if(s[i] == 'O') {
                ++st;
                c += st;
            } else {
                st = 0;
            }
        }
        cout << c << "\n";
    }
    return 0;
}
