#include <iostream>

using namespace std;

int main() {
    int n;
    long long s = 1;
    cin >> n;
    for(int i = 0; i < n; ++i) {
        int t;
        cin >> t;
        s = (s*t)%1000000007;
    }
    cout << s << "\n";
    return 0;
}