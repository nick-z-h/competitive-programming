#include <bits/stdc++.h>

using namespace std;

double price(int p, int a, int b, int c, int d, int k) {
   return p * (sin(a*k+b) + cos(c*k+d)+2); 
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int p, a, b, c, d, n;
    cin >> p >> a >> b >> c >> d >> n;
    double mx = -1, mn = -1, r = 0;
    for(int i = 1; i <= n; ++i) {
        double t = price(p, a, b, c, d, i);
        if(t > mx) {
            mx = t;
            mn = t;
        }
        if(t < mn) {
            mn = t;
        }
        r = max(r, mx - mn);
    }
    cout << setprecision(12) << r << "\n";
    return 0;
}
