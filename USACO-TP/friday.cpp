/*
ID: nzh
TASK: friday
LANG: C++        
*/

#include <iostream>
#include <fstream>

using namespace std;

bool is_leap(int n) {
    if(n%100 == 0) {
        if(n%400 == 0) {
            return true;
        }
        return false;
    }
    if(n%4 == 0) {
        return true;
    }
    return false;
}

int main() {
    ofstream fout("friday.out");
    ifstream fin("friday.in");
    int n;
    fin >> n;
    int d = 13;
    int f[7] = {0};
    int lm[12] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int m[12] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    for(int i = 1900; i < 1900 + n; ++i) {
        for(int j = 0; j < 12; ++j) {
            ++f[d%7];
            if(is_leap(i)) {
                d += lm[j];
            } else {
                d += m[j];
            }
        }
    }
    fout << f[6];
    for(int i = 0; i < 6; ++i) {
        fout << " " << f[i];
    }
    fout << "\n";
    return 0;
}
