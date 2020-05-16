#include <iostream>

using namespace std;

int main()
{
    int n;
    cin >> n;
    int c = 0;
    for(int i = 0; i < n; ++i) {
        int t;
        cin >> t;
        if(t < 0) {
            ++c;
        }
    }
    cout << c << "\n";
    return 0;
}