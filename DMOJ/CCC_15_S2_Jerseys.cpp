#include <iostream>

using namespace std;

int v[1000001];

int main() {
    int j, a;
    cin >> j >> a;
    for(int i=1; i<=j; ++i) {
        char t;
        cin >> t;
        if(t=='S') {
            v[i]=0;
        } else if(t=='M') {
            v[i]=1;
        } else if(t=='L') {
            v[i]=2;
        }
    }
    int c = 0;
    for(int i=1; i<=a; ++i) {
        char t;
        int at, s = 0;
        cin >> t >> at;
        if(t=='S') {
            s=0;
        } else if(t=='M') {
            s=1;
        } else if(t=='L') {
            s=2;
        }
        if(at > 0 && at<=j && v[at]>=s) {
            ++c;
            v[at]=-1;
        }
    }
    cout << c << "\n";
    return 0;
}
