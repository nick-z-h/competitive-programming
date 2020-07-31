#include <bits/stdc++.h>

using namespace std;

int m(int a, string n) {
    string t;
    t += to_string(n.size());
    if(t == n) {
        return a;
    }
    return m(++a, t);
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    string n;
    while(cin >> n) {
        if(n == "END") {
            break;
        }
        cout << m(1, n) << "\n";
    }
    return 0;
}
