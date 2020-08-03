#include <bits/stdc++.h>

using namespace std;

int m(int n) {
    if(n < 4) {
        return 1;
    }
    return n-2;
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    cout << m(n) << "\n";
    return 0;
}
