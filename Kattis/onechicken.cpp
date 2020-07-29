#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int a, b;
    cin >> a >> b;
    if(a > b) {
        if(a-b == 1) {
            cout << "Dr. Chaz needs " << a - b << " more piece of chicken!\n";
        } else {
            cout << "Dr. Chaz needs " << a - b << " more pieces of chicken!\n";
        }
    } else if(a < b) {
        if(b-a == 1) {
            cout << "Dr. Chaz will have " << b - a << " piece of chicken left over!\n";
        } else {
            cout << "Dr. Chaz will have " << b - a << " pieces of chicken left over!\n";
        }
    }
    return 0;
}
