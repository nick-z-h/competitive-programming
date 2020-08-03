#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int a, c;
    while(cin >> a && a) {
        cin >> c;
        int lh = a, ct = 0;
        for(int i = 0; i < c; ++i) {
            int t;
            cin >> t;
            if(lh > t) {
                ct += lh - t;
            }
            lh = t;
        }
        cout << ct << "\n";
    }
    return 0;
}
