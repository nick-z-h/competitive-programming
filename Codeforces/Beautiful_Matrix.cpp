#include <iostream>

using namespace std;

int mat[5][5];
int main() {
    int x, y;
    for(int i = 0; i < 5; ++i) {
        for(int j = 0; j < 5; ++j) {
            cin >> mat[i][j];
            if(mat[i][j] == 1) {
                x = i+1;
                y = j+1;
                break;
            }
        }
    }
    cout << abs(x-3) + abs(y-3) << "\n";
    return 0;
}
