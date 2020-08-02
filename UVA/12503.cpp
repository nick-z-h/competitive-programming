#include <bits/stdc++.h>

using namespace std;

int a[100];
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        int n;
        cin >> n;
        string s;
        getline(cin , s);
        for(int j = 0; j < n; ++j) {
            getline(cin, s);
            if(s[0] == 'S') {
                s.erase(0, 8);
                int in = stoi(s) -1;
                a[j] = a[in];
            } else if(s == "LEFT") {
                a[j] = -1;
            } else if(s == "RIGHT") {
                a[j] = 1;
            }
        }
        int p = 0;
        for(int j = 0; j < n; ++j) {
            p = p + a[j];
        }
        cout << p << "\n";
    }
    return 0;
}
