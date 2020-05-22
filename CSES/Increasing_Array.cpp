#include <iostream>

using namespace std;

int main() {
    long long n, l, ans = 0;
    cin >> n >> l;
    for(int i = 1; i < n; ++i) {
        long long t;
        cin >> t;
        if(t < l) {
            ans += l - t;
        } else {
            l = t;
        }
    }
    cout << ans << "\n";
    return 0;
}
