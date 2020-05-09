#include <iostream>

using namespace std;

int a[100000];
int main() {
    int n, h, pos = 0;
    bool f = false;
    cin >> n >> h;
    for(int i = 0; i < n; ++i) {
        cin >> a[i];
    }
    while(true) {
        int t;
        cin >> t;
        if( t== 0) {
            for(int i = 0; i < n; ++i) {
                cout << a[i] << " ";
            }
            break;
        }
        switch(t) {
            case 1:
            if(pos != 0) {
                --pos;
            }
            break;
            case 2:
            if(pos != n-1) {
                ++pos;
            }
            break;
            case 3:
            if(!f && a[pos] > 0) {
                f = true;
                --a[pos];
            }
            break;
            case 4:
            if(f && a[pos] < h) {
                f = false;
                ++a[pos];
            }
            break;
        }
    }
    return 0;
}