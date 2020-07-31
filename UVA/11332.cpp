#include <bits/stdc++.h>

using namespace std;

int g(int n) {
    int r = 0;
    while(n != 0) {
        r += n%10;
        n /= 10;
    }
    if(r < 10) {
        return r;
    }
    return g(r);
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    while(cin >> n) {
        if(n == 0) {
            break;
        }
        cout << g(n) << "\n";
    }
    return 0;
}
