#include <iostream>
#include <algorithm>

using namespace std;

int a[100000];
int b[100000];
int v[100000];
int w[100000];

int binarySearch1(int a[], int L, int R, int K) {
    int ans = -1;
    while(L <= R) {
        int mid = L + (R-L)/2;
        if(a[mid] <= K) {
            ans = mid;
            L = mid + 1;
        } else {
            R = mid - 1;
        }
    }
    return ans;
}

int binarySearch2(int a[], int L, int R, int K) {
    int ans = -1;
    while(L <= R) {
        int mid = L + (R-L)/2;
        if(a[mid] >= K) {
            ans = mid;
            R = mid - 1;
        } else {
            L = mid + 1;
        }
    }
    return ans;
}

int main() {
    int n, x, y;
    cin >> n >> x >> y;
    for(int i = 0; i < n; ++i) {
        cin >> a[i];
        cin >> b[i];
    }
    for(int i = 0; i < x; ++i) {
        cin >> v[i];
    }
    for(int i = 0; i < y; ++i) {
        cin >> w[i];
    }
    sort(v, v + x);
    sort(w, w + y);
    int m = 1000000;
    for(int i = 0; i < n; ++i) {
        int l = binarySearch1(v, 0, x-1, a[i]);
        int h = binarySearch2(w, 0, y-1, b[i]);
        if(l != -1 && h != -1) {
            m = min(w[h]-v[l], m);
        }
    }
    cout << m+1 << "\n";
    return 0;
}