#include <iostream>

using namespace std;

int a[200001];
int main() {
    long long n;
    cin >> n;
    for(int i = 0; i < n-1; ++i) {
        cin >> a[i];
    }
    long long t = n * (n+1)/2;
    for(int i = 0; i < n; ++i) {
        t -= a[i];
    }
    cout << t << "\n";
    return 0;
}
