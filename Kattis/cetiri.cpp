#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int a, b, c;
    cin >> a >> b >> c;
    if(a > b) {
        swap(a, b);
    }
    if(a > c) {
        swap(a, c);
    }
    if(b > c) {
        swap(b, c);
    }
    if(b - a == c - b) {
        cout << c + c - b << "\n";
    } else if(b - a > c - b) {
        cout << a + c - b << "\n";
    } else {
        cout << b + b - a << "\n";
    }
    return 0;
}
