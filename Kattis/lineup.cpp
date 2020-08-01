#include <bits/stdc++.h>

using namespace std;

string a[20];
string b[20];
string c[20];
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    for(int i = 0; i < n; ++i) {
        string t;
        cin >> t;
        a[i] = t;
        b[i] = t;
        c[i] = t;
    }
    sort(b, b + n);
    sort(c, c + n, greater<string>());
    int u = 0, o = 0;
    for(int i =0; i < n; ++i) {
        if(a[i] == b[i]) {
            u += 1;
        }
        if(a[i] == c[i]) {
            o += 2;
        }
    }
    if(u == n){
        cout << "INCREASING\n";
    } else if(o == n*2) {
        cout << "DECREASING\n";
    } else {
        cout << "NEITHER\n"; 
    }
    return 0;
}
