/*
ID: nzh
TASK: transform
LANG: C++        
*/

#include <iostream>
#include <fstream>

using namespace std;

char a[10][10], b[10][10];
int n = 10;

bool is_90() {
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            if(a[i][j] != b[j][n-i-1]) {
                return false;
            }
        }
    }
    return true;
}

bool is_180() {
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            if(a[i][j] != b[n-i-1][n-j-1]) {
                return false;
            }
        }
    }
    return true;
}

bool is_270() {
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            if(a[i][j] != b[n-i-1][i]) {
                return false;
            }
        }
    }
    return true;
}

bool is_reflection() {
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            if(a[i][j] != b[i][n-j-1]) {
                return false;
            }
        }
    }
    return true;
}

bool is_combination() {
    char t[10][10];
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            t[i][j] = a[i][j];
        }
    }
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            a[i][n-j-1] = t[i][j];
        }
    }
    if(is_90() || is_180() || is_270()) {
        return true;
    }
    return false;
}

bool is_equal() {
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            if(a[i][j] != b[i][j]) {
                return false;
            }
        }
    }
    return true;
}

int main() {
    ofstream fout("transform.out");
    ifstream fin("transform.in");
    fin >> n;
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            fin >> a[i][j];
        }
    }
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            fin >> b[i][j];
        }
    }

    if(is_90()) {
        fout << 1 << "\n";
    } else if(is_180()) {
        fout << 2 << "\n";
    } else if(is_270()) {
        fout << 3 << "\n";
    } else if(is_reflection()) {
        fout << 4 << "\n";
    } else if(is_equal()) {
        fout << 6 << "\n";
    } else if(is_combination()) {
        fout << 5 << "\n";
    } else {
        fout << 7 << "\n";
    }
    
    return 0;
}
