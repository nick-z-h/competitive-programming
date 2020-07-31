#include <bits/stdc++.h>

using namespace std;

int reverse(int n) {
    int r = 0;
    while(n != 0) {
        int t = n%10;
        r = r*10 + t;
        n /= 10;
    }
    return r;
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int a, b;
    cin >> a >> b;
    a = reverse(a);
    b = reverse(b);
    cout << max(a, b) << "\n";
    return 0;
}
