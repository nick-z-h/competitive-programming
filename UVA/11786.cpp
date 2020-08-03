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
        cin >> s;
        int c = 0;
        stack< int > ch;
        for(int j = 0; j < s.size(); ++j) {
            if(s[j] == '\\' ) {
                ch.push(j);
            } else if(!ch.empty() && s[j] == '/') {
                c += j - ch.top();
                ch.pop();
            }
        }
        cout << c << "\n";
    }
    return 0;
}
