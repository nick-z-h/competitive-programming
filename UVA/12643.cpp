#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n, a, b;
        while(cin >> n >> a >> b) {
                for(int i = 0; i  < n; ++i) {
                        a = (a+1)/2;
                        b = (b+1)/2;
                        if(a == b) {
                                cout << i + 1 << "\n";
                                break;
                        }
                }
        }
        return 0;
}
