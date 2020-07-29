#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    for(int i = 0; i < n; ++i) {
        string s;
        if(i == 0) {
            getline(cin, s);
        }
        getline(cin, s);
        if(s == "P=NP") {
            cout << "skipped\n";
        } else {
            int a, b;
            a = stoi(s.substr(0, s.find("+")));
            b = stoi(s.substr(s.find("+")+1));
            cout << a + b << "\n";
        }
    }
    return 0;
}
