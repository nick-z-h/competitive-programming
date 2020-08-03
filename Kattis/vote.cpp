#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        int n;
        cin >> n;
        int in = -1, mx = 0, tol = 0;
        for(int j = 0; j < n; ++j) {
            int x;
            cin >> x;
            if(x > mx) {
                mx = x;
                in = j;
            } else if(x == mx) {
                mx = x;
                in = -1;
            }
            tol += x;
        }
        if(in >= 0) {
            if(mx > tol - mx) {
                cout << "majority winner " << in + 1 << "\n";
            } else {
                cout << "minority winner " << in + 1<< "\n";
            }
        } else {
            cout << "no winner\n";
        }
    }
    return 0;
}
