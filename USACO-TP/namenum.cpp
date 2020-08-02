/*
ID: nzh
TASK: namenum
LANG: C++        
*/

#include <iostream>
#include <fstream>
#include <map>

using namespace std;

int main() {
    ofstream fout("namenum.out");
    ifstream fin("namenum.in");
    ifstream dict("dict.txt");
    bool f = true;
    string a, b;
    fin >> a;
    while(dict >> b) {
        if(a.length() == b.length()) {
            string res = "";
            for(int i = 0; i < b.length(); ++i) {
                if(b[i] == 'A' || b[i] == 'B' || b[i] == 'C') {
                    res += '2';
                } else if(b[i] == 'D' || b[i] == 'E' || b[i] == 'F') {
                    res += '3';
                } else if(b[i] == 'G' || b[i] == 'H' || b[i] == 'I') {
                    res += '4';
                } else if(b[i] == 'J' || b[i] == 'K' || b[i] == 'L') {
                    res += '5';
                } else if(b[i] == 'M' || b[i] == 'N' || b[i] == 'O') {
                    res += '6';
                } else if(b[i] == 'P' || b[i] == 'R' || b[i] == 'S') {
                    res += '7';
                } else if(b[i] == 'T' || b[i] == 'U' || b[i] == 'V') {
                    res += '8';
                } else if(b[i] == 'W' || b[i] == 'X' || b[i] == 'Y') {
                    res += '9';
                }
            }
            if(res == a) {
                fout << b << "\n";
                f = false;
            }
        }
    }
    if(f) {
        fout << "NONE" << "\n";
    }
    return 0;
}
