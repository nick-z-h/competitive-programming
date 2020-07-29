#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    for(int i = 0; i < n; ++i) {
        string name, bps, bd;
        int c;
        cin >> name >> bps >> bd >> c;
        if(bps >= "2010/01/01") {
            cout << name << " eligible\n";
        } else if(bd >= "1991/01/01") {
            cout << name << " eligible\n";
        } else if (c > 40) {
            cout << name << " ineligible\n";
        } else {
            cout << name << " coach petitions\n";
        }
    }
    return 0;
}
