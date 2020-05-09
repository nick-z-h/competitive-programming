#include <iostream>

using namespace std;

int main() {
    int t;
    cin >> t;
    for(int i = 0; i < t; ++i) {
        int n;
        cin >> n;
        int c = n%12;
        switch(c) {
            case 0:
            cout << (n - 11) << " WS" << "\n";
            break;
            case 1: 
            cout << (n + 11) << " WS" << "\n";
            break;
            case 2: 
            cout << (n + 9) << " MS" << "\n";
            break;
            case 3: 
            cout << (n + 7) << " AS" << "\n";
            break;
            case 4: 
            cout << (n + 5) << " AS" << "\n";
            break;
            case 5:
            cout << (n + 3) << " MS" << "\n";
            break;
            case 6: 
            cout <<( n + 1) << " WS" << "\n";
            break;
            case 7:
            cout << (n - 1) << " WS" << "\n";
            break;
            case 8:
            cout << (n - 3) << " MS" << "\n";
            break;
            case 9: 
            cout << (n - 5) << " AS" << "\n";
            break;
            case 10:
            cout << (n - 7) << " AS" << "\n";
            break;
            case 11: 
            cout << (n - 9) << " MS" << "\n";
            break;
        }
    }
    return 0;
}