#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main() {
    int n, x , y , z;
    cin >> x >> y >> z;
    n = x + y + z;
    int a[n];
    for(int i = 0; i < n; ++i) {
        cin >> a[i];
    }
    sort(a, a + n);
    vector<int> v;
    for(int i = 1; i <  n-1; ++i) {
        if(a[i-1] == a[i] && a[i+1] != a[i]) {
            v.push_back(a[i]);
        }
    }
    cout << v.size() << "\n";
    for(int i = 0; i < v.size(); ++i) {
        cout << v[i] << "\n";
    }
    return 0;
}
