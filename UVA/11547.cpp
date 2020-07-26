#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        int n;
        cin >> n;
        n = (((n*567/9 + 7492)*235)/47 - 498)/10 % 10;
        cout << abs(n) << "\n";
        
    }
    return 0;
}