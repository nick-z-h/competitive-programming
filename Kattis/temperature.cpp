#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int x, y;
    cin >> x >> y;
    if(y == 1) {
        if(x == 0) {
            cout << "ALL GOOD\n";
        } else {
            cout << "IMPOSSIBLE\n";
        }
    } else {
        cout << setprecision(9) << ((double)x/(double)(1-y)) << "\n";
    }
    return 0;
}
