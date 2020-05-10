#include <iostream>
#include <algorithm>
using namespace std;

int arr[100000000];
int main() {
    int a, b, c;
    cin >> a >> b >> c;
    for(int i = 0; i < a+b+c; ++i ) {
       int t;
       cin >> t;
       ++arr[t];
    }
    return 0;
}