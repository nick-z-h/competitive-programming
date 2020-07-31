#include <bits/stdc++.h>

using namespace std;

int g(int n) {
    while(n >= 10) {
        int t = 0;
        while(n != 0) {
            t += n%10;
            n /= 10;
        }
        n = t;
    }
    return n;
}

int lc(string s) {
    int c = 0;
    for(int i = 0; i < s.size(); ++i) {
        if(isalpha(s[i])) {
            s[i] = tolower(s[i]);
            c += s[i] - 96;
        }
    }
    return g(c);
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    string a, b;
    while(getline(cin, a) && getline(cin, b)) {
        double ra = lc(a), rb = lc(b);
        printf("%.2f %%\n", min(ra,rb)/max(ra,rb)*100);
    }
    return 0;
}
