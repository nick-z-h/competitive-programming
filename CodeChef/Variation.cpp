#include <iostream>
#include <algorithm>

using namespace std;

int a[65000];
int main() {
    int n, k, c = 0;
    cin >> n >> k;
    for(int i = 0; i < n; ++i) {
        cin >> a[i];
    }
    sort(a, a + n);
    for(int i = 0, j = 1; i < n && j < n;) {
        if(a[j] - a[i] >= k) {
            c += n-j;
            ++i;
        } else {
            ++j;
        }
    }
    cout << c << "\n";
    return 0;
}