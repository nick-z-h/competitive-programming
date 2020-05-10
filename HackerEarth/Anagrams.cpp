#include <iostream>

using namespace std;
int ca[26];
int cb[26];
int main() {
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        string a, b;
        cin >> a >> b;
        if(a == b) {
            cout << 0;
        } else {
            int c = 0;
            for(int i = 0; i < a.length(); ++i) {
                for(int j = 0; j < b.length(); ++j) {
                    if(a[i] == b[j]) {
                        b[j] = 0;
                        c++;
                        break;
                    }
                }
            }
            cout << a.length() - c + b.length() - c << "\n";
        }
    }
    return 0;
}