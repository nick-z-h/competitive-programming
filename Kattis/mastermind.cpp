#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n;
        string a, b;
        cin >> n >> a >> b;
        int r = 0, s = 0;
        for (int i = 0; i < n; ++i) {
                if (a[i] == b[i]) {
                        ++r;
                }
        }
        while (!a.empty()) {
                int in = b.find(a[a.size() - 1]);
                if (in >= 0) {
                        ++s;
                        b.erase(b.begin() + in);
                }
                a.pop_back();
        }
        
        cout << r << " " << s - r << "\n";
        return 0;
}
