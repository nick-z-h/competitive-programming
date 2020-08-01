#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    int c = 0, m = 0;
    for(int i = 0; i < n; ++i) {
        int t;
        cin >> t;
        if(t >= 0) {
            ++m;
            c += t;
        }
    }
    cout << fixed << setprecision(10) << (double)c/(double)m << "\n";
    return 0;
}
