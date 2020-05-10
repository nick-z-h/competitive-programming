#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;

int main() {
    int n;
    cin >> n;
    int c = 0, mc = 0, cl = 0, ml = 0,  p = 1, mp, lp;
    for(int i = 1; i <= n; ++i) {
        int t;
        cin >> t;
        if(t == 1) {
            c++;
            if(c == 1) {
                p = i;
            }
        } else {
            c--;
            if(c == 0) {
                if(i - p + 1 > ml) {
                    ml = i - p + 1;
                    lp = p;
                }
            }
        }
        if(c > mc) {
            mp = i;
            mc = c;
        }
    }
    cout << mc << " " << mp << " " << ml << " " << lp << "\n";
    return 0;
}