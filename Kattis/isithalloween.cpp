#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    string s;
    getline(cin, s);
    if(s == "OCT 31" || s == "DEC 25") {
        cout << "yup\n";
    } else {
        cout << "nope\n";
    }
    return 0;
}
