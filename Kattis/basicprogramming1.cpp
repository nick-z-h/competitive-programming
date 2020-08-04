#include <bits/stdc++.h>

using namespace std;

bool vs[200001];
unsigned int a[200001];
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int n, t;
    cin >> n >> t;
    for(int i = 0; i < n; ++i) {
        cin >> a[i];
    }
    if(t == 1) {
        cout << 7 << "\n";
    }
    if(t == 2) {
        if(a[0] > a[1]) {
            cout << "Bigger\n";
        } else if(a[0] == a[1]) {
            cout << "Equal\n";
        } else {
            cout << "Smaller\n";
        }
    }
    if( t == 3 ) {
        if((a[0] < a[1] && a[0] > a[2]) || (a[0] > a[1] && a[0] < a[2])) {
            cout << a[0] << "\n";
        } else if((a[1] < a[0] && a[1] > a[2]) || (a[1] > a[0] && a[1] < a[2])) {
            cout << a[1] << "\n";
        } else {
            cout << a[2] << "\n";
        }
    }
    if( t == 4  ) {
        long long tol = 0;
        for(int i = 0; i < n; ++i) {
            tol += a[i];
        }
        cout << tol << "\n";
    }
    if ( t == 5 ) {
        long long tol = 0;
        for(int i = 0; i < n; ++i) {
            if(a[i]%2 == 0){
                tol += a[i];       
            }
        }
        cout << tol << "\n";
    }
    if( t == 6 ) {
        string r;
        for(int i = 0; i < n; ++i) {
            r += a[i]%26 + 97;
        }
        cout << r << "\n";
    }
    if( t == 7 ) {
        for(int i = 0; i < n; ++i) {
            vs[i] = false;
        }
        int in = 0;
        while(true) {
            if(in >= n) {
                cout << "Out\n";
                break;
            } else if(in == n-1) {
                cout << "Done\n";
                break;
            } else if(vs[in] == true) {
                cout << "Cyclic\n";
                break;
            }
            vs[in] = true;
            in = a[in];
        }
    }
    return 0;
}
