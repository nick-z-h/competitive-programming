#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    map< string, int  > mp;
    int t, c = 0, g = 0;
    string a, b;
    while(cin >> t) {
        if(t == -1) {
            break;
        }
        cin >> a >> b;
        if( b == "wrong" ) {
            if(mp.count(a)) {
                ++mp[a];
            } else {
                mp[a] = 1;
            }
        } else {
            c += mp[a]*20 + t;
            ++g;
        }
    }
    cout << g << " " << c << "\n";
    return 0;
}
