#include <bits/stdc++.h>

using namespace std;

int main() {
        ios::sync_with_stdio(0);
        cin.tie(0);
        int n;
        cin >> n;
        double t = 0;
        for(int i = 0; i < n; ++i) {
                double a, b;
                cin >> a >> b;
                t += a*b;
        }
        printf("%.3f\n", t);
        return 0;
}
