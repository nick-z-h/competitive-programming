#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int a, b;
    while(cin >> a >> b) {
        if(a + b == 0) {
            break;
        } else if(a + b == 13) {
            cout << "Never speak again.\n";
        } else if(a > b) {
            cout << "To the convention.\n";
        } else if(a < b) {
            cout << "Left beehind.\n";
        } else {
            cout << "Undecided.\n";
        }
    }
    return 0;
}
