#include <iostream>

using namespace std;

bool v[1000001];

int main() {
    int j, a, s = 0, m = 0, l = 0, c = 0;
    cin >> j >> a;
    for(int i = 0; i < j; ++i) {
        char C;
        cin >> C;
        switch(C) {
            case 'S':
                ++s;
                break;
            case 'M':
                ++m;
                break;
            case 'L':
                ++l;
                break;
        }
    }
    for(int i = 0; i < a; ++i) {
        char C;
        cin >> C;
        int t;
        cin >> t;
        switch(C) {
            case 'S':
                if(s > 0 && v[t] == false) {
                    --s;
                    v[t] = true;
                    ++c;
                }
                break;
            case 'M':
                if(m > 0 && v[t] == false) {
                    --m;
                    v[t] = true;
                    ++c;
                }
                break;
            case 'L':
                if(l > 0 && v[t] == false) {
                    --l;
                    v[t] = true;
                    ++c;
                }
                break;
        }
    }
    cout << c << "\n";
    return 0;
}
