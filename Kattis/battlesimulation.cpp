#include <bits/stdc++.h>

using namespace std;

char op(char n) {
    if(n == 'R') {
        return 'S';
    }
    if(n == 'B') {
        return 'K';
    }
    if(n == 'L') {
        return 'H';
    }
    return '!';
}

string m(string n) {
    string s;
    for(int i = 0; i < n.size(); ++i) {
        if(n.substr(i, 3) == "RBL" || n.substr(i, 3) == "RLB" || n.substr(i, 3) == "LRB" || n.substr(i, 3) == "LBR" ||n.substr(i, 3) == "BRL" || n.substr(i, 3) == "BLR") {
            s += 'C';
            i += 2;
        } else {
            s += op(n[i]);
        }
    }
    return s;
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    string s;
    cin >> s;
    cout << m(s) << "\n";
    return 0;
}
