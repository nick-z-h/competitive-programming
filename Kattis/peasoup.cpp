#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n;
    cin >> n;
    bool f = true;
    for(int i = 0; i < n; ++i) {
        int k;
        bool ps = false, pc = false;
        cin >> k;
        string nm;
        getline(cin, nm);
        getline(cin, nm);
        for(int j = 0; j < k; ++j) {
            string t;
            getline(cin, t);
            if(t == "pea soup") {
                ps = true;
            }
            if(t == "pancakes") {
                pc = true;
            }
            if(ps && pc && f) {
                cout << nm << "\n";
                f = false;
            }
        }
    }
    if(f) {
        cout << "Anywhere is fine I guess\n";
    }
    return 0;
}
