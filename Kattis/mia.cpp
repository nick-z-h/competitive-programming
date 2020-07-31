#include <bits/stdc++.h>

using namespace std;

int check(int a, int b) {
    if((a == 1 && b == 2) || (a == 2 && b == 1)) {
        return 1000;
    }
    if(a == b) {
        return a*11 + 100;
    }
    return max(a, b) * 10 + min(a, b);
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int x1, x2, y1, y2;
    while(cin >> x1 >> x2 >> y1 >> y2) {
        if(x1 == 0) {
            break;
        }
        int a = check(x1, x2), b = check(y1, y2);
        if(a > b) {
            cout << "Player 1 wins.\n";
        } else if(a < b) {
            cout << "Player 2 wins.\n";
        } else {
            cout << "Tie.\n";
        }
    }
    return 0;
}
