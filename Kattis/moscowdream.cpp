#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int a, b, c , n;
    cin >> a >> b >> c >> n;
    if(a + b + c > n) {
        if(a < 1 || b < 1 || c < 1 || n < 3) {
            cout << "NO" << "\n";
        } else {
            cout << "YES" << "\n";
        } 
    } else {
        cout << "NO" << "\n";
    }
    return 0;
}
