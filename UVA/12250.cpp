#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int c = 0;
    string s;
    while(cin >> s) {
        if(s == "#") {
            break;
        }
        ++c;
        cout << "Case " << c << ": ";
        if(s == "HELLO") {
            cout << "ENGLISH\n";
        } else if(s == "HOLA") {
            cout << "SPANISH\n";
        } else if(s == "HALLO") {
            cout << "GERMAN\n";
        } else if(s == "BONJOUR") {
            cout << "FRENCH\n";
        } else if(s == "CIAO") {
            cout << "ITALIAN\n";
        } else if(s == "ZDRAVSTVUJTE") {
            cout << "RUSSIAN\n";
        } else {
            cout << "UNKNOWN\n";
        }
    }
    return 0;
}
