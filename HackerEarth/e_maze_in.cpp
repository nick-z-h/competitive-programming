#include <iostream>

using namespace std;

int main() {
    string s;
    cin >> s;
    int x = 0, y = 0;
    for(int i = 0; i < s.length(); ++i) {
        switch(s[i]) {
            case 'L':
            x--;
            break;
            case 'R':
            x++;
            break;
            case 'D':
            y--;
            break;
            case 'U':
            y++;
            break;
        }
    }
    cout << x << " " << y << "\n";
    return 0;
}