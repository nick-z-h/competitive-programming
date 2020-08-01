#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    string s;
    bool f = false;
    cin >> s;
    for(int i = 0; i < s.size()-1; ++i) {
        if(s[i] == 's' && s[i+1] == 's') {
            f = true;
            break;
        }
    }
    if(f) {
        cout << "hiss\n";
    } else {
        cout << "no hiss\n";
    }
    return 0;
}
