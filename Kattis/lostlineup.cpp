#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    int a[n];
    a[0] = 1;
    for(int i = 0; i < n - 1; ++i) {
        int t;
        cin >> t;
        a[t+1] = i + 2;
    }
    for(int i = 0; i < n; ++i) {
        cout << a[i] << " ";
    }
    cout << "\n";
    return 0;
}
