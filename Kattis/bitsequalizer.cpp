#include <bits/stdc++.h>

using namespace std;

int op(string a, string b) {
    if(a == b) {
        return 0;
    }
    int td = 0, x = 0, y = 0, vl = 0;
    for(int i = 0; i < a.size(); ++i) {
        if (a[i] != b[i]) {
            ++td;
        }
        if(a[i] == '?' && b[i] == '1') {
            ++vl;
        }
        if(a[i] == '0' && b[i] == '1') {
            ++x;
            ++vl;
        }
        if(a[i] == '1' && b[i] == '0') {
            ++y;
            --vl;
        }
    }
    if(vl < 0) {
        return -1;
    } 
    return td - min(x, y);
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        string a, b;
        cin >> a >> b;
        cout << "Case " << i+1 << ": " << op(a, b) << "\n";
    }
    return 0;
}
