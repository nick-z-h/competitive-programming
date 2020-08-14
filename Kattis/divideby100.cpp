#include <bits/stdc++.h>

using namespace std;

string r(string a, string b) {
        while (a.back() == '0' && b.back() == '0') {
                a.pop_back();
                b.pop_back();
        }
        if (a == b) {
                return "1";
        }
        if (b == "1") {
                return a;
        }
        if (a.size() == b.size()) {
                string res(1, a[0]);
                string x = a.substr(1, a.size() -1);
                return res + "." + x;
        }
        if (a.size() > b.size()) {
                string x = a.substr(0, a.size() - b.size() + 1), y = a.substr(a.size() - b.size() + 1);
                return x + "." + y;
        }
        string res = "0.";
        for (int i = 0; i < b.size() - a.size() - 1; ++i) {
                res += '0';
        }
        return res + a;
}

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        string a, b;
        while (cin >> a >> b) {
                cout << r(a, b) << "\n";
        }
        return 0;
}
