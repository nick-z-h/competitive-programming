/*
ID: nzh
TASK: gift1
LANG: C++        
*/

#include <iostream>
#include <fstream>
#include <map>

using namespace std;

int main() {
    ofstream fout("gift1.out");
    ifstream fin("gift1.in");
    int np;
    fin >> np;
    string nm[np];
    map<string, int> mn;
    for(int i = 0; i < np; ++i) {
        fin >> nm[i];
        mn[nm[i]] = 0;
    }
    for(int i = 0; i < np; ++i) {
        string s;
        int a, b;
        fin >> s >> a >> b;
        if(a == 0 && b == 0) {
            continue;
        }
        int gm = a/b;
        if(a%b != 0) {
            mn[s] += a%b;
        }
        mn[s] -= a;
        for(int i = 0; i < b; ++i) {
            string t;
            fin >> t;
            mn[t] += gm;
        }
    }
    for(int i = 0; i < np; ++i) {
        fout << nm[i] << " " <<  mn[nm[i]] << "\n";
    }
    return 0;
}
