#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int a, b;
    cin >> a >> b;
    if(a == 0 && b == 0) {
        cout << "Not a moose\n";
    } else if(a == b) {
        cout << "Even " << a * 2 << "\n";
    } else {
        cout << "Odd " << max(a, b) * 2 << "\n";
    }
    return 0;
}
