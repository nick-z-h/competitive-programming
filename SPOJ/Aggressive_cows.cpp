#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin >> t;
    while(t--) {
        int n, c;
        cin >> n >> c;
        long long a[n];
        for(int i = 0; i < n; ++i) {
            cin >> a[i];
        }
        sort(a, a + n);
        long long low = 0, high = a[n-1], bt = 1;
        while(low <= high) {
            long long mid = low + (high-low)/2, cur = 0, cnt = 1;
            for(int i = 1; i < n && cnt < c; ++i) {
                if(a[i] - a[cur] >= mid) {
                    cur = i;
                    ++cnt;
                }
            }
            if(cnt >= c) {
                bt = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        cout << bt << "\n";
    }
    return 0;
}
