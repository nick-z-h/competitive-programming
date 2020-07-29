#include <bits/stdc++.h>

using namespace std;

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    int a, b, c;
    cin >> a >> b >> c;
    int t = 3 * a + 2 * b + c;
    if(t >= 8) {
        cout << "Province or Gold\n";
    } else if(t >= 6) {
        cout << "Duchy or Gold\n";
    } else if(t >= 5) {
        cout << "Duchy or Silver\n";
    } else if(t >= 3) {
        cout << "Estate or Silver\n";
    } else if(t >= 2) {
        cout << "Estate or Copper\n";
    } else {
        cout << "Copper\n";
    }
    return 0;
}
