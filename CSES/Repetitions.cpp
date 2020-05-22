#include <iostream>

using namespace std;

int main() {
    string s;
    cin >> s;
    int c = 0, m = 0;
    for(int i = 1; i < s.length(); ++i) {
        if(s[i-1] == s[i]) {
            ++c;
            m = max(m, c);
        } else {
            c = 0;
        }
    }
    cout << m+1 << "\n";
    return 0;
}
