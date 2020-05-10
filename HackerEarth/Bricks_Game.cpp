#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int i = 0;
    while(n > 0) {
        ++i;
        n -= i;
        if(n < 0) {
            cout << "Patlu" << "\n";
            break;
        }
        n -= 2*i;
        if(n < 0) {
            cout << "Motu" << "\n";
            break;
        }
    }
    return 0;
}