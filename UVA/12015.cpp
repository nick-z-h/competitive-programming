#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        vector< string > v;
        int m = 0;
        for(int j = 0; j < 10; ++j) {
            string s;
            int a;
            cin >> s >> a;
            if( a > m ) {
                m = a;
                v.clear();
                v.push_back(s);
            } else if(a == m) {
                v.push_back(s);
            }
        }
        cout << "Case #" << i+1 << ":\n";
        for(int j = 0; j < v.size(); ++j) {
            cout << v[j] << "\n";
        }
    }
    return 0;
}
