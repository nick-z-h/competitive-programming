#include <iostream>
#include <algorithm>

using namespace std;

int a[200000];
int b[200000];

void ps(int a[], int b[], int n) {
    pair<int, int> pairt[n];
    for(int i = 0; i < n; ++i) {
        pairt[i].first = b[i];
        pairt[i].second = a[i];
    }
    sort(pairt, pairt + n);
    for(int i = 0; i < n; ++i) {
        a[i] = pairt[i].second;
        b[i] = pairt[i].first;
    }
}

int main() {
    int n;
    cin >> n;
    for(int i = 0; i < n; ++i) {
        cin >> a[i];
        int x, y;
        cin >> x >> y;
        b[i] = x + y;
    }
    ps(a, b, n);
    int an = a[n-1] + b[n-1], p = a[n-1];
    for(int i = n-2; i >= 0; --i) {
        an = max(an, p + a[i] + b[i]);
        p += a[i];
    }
    cout << an << "\n";
    return 0;
}