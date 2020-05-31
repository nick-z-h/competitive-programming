/*
ID: nzh
TASK: beads
LANG: C++        
*/

#include <iostream>
#include <fstream>

using namespace std;

int main() {
    ofstream fout("beads.out");
    ifstream fin("beads.in");
    int n, m = 0;
    string s;
    fin >> n >> s;
    s += s;
    for(int i = 0; i < n; ++i) {
        int st, c = 0;
        char ch = s[i];
        if(ch == 'w') {
            st = 0;
        } else {
            st = 1;
        }
        int j = i;
        while(st <= 2) {
            while(j < n + i && (s[j] == ch || s[j] == 'w')) {
                ++c;
                ++j;
            }
            ++st;
            ch = s[j];
        }
        m = max(m, c);
    }
    fout << m << "\n";
    return 0;
}
