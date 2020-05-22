#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    if(n == 1) {
        cout << 1 << "\n";
    } else if(n < 4 && n != 1) {
        cout << "NO SOLUTION" << "\n";
    } else {
        string a, b;
        for(int i = 1; i <= n; ++i) {
            if(i%2 == 0) {
                a += to_string(i) + " ";
            } else {
                b += to_string(i) + " ";
            }
        }
        cout << a + b << "\n";
    }
    return 0;
}
