/*
ID: nzh
TASK: palsquare
LANG: C++        
*/

#include <iostream>
#include <fstream>
#include <algorithm>

using namespace std;

char v[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};

string base(int n, int b) {
    string t;
    while(n != 0) {
        t = v[n%b] + t;
        n /= b;
    }
    return t;
}

bool is_pal(string n) {
    string t = n;
    reverse(n.begin(), n.end());
    if(t == n) {
        return true;
    }
    return false;
}

int main() {
    ofstream fout("palsquare.out");
    ifstream fin("palsquare.in");
    int n;
    fin >> n;
    for(int i = 1; i <= 300; ++i) {
        string t = base(i, n);
        string s = base(i*i, n);
        if(is_pal(s)) {
            fout << t << " " << s << "\n";
        }
    }
    return 0;
}
