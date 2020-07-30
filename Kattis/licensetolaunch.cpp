#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, m = INT_MAX, d;
    cin >> n;
    for(int i = 0; i < n; ++i) {
        int t;
        cin >> t;
        if(t < m) {
            m = t;
            d = i;
        } 
    }
    cout << d << "\n";
    return 0;
}
