#include <bits/stdc++.h>

using namespace std;

int a[85];
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    for(int i = 0; i < 5; ++i) {
        string s;
        cin >> s;
        ++a[s[0]];
    }
    sort(a, a + 85);
    cout << a[84] << "\n";
    return 0;
}
