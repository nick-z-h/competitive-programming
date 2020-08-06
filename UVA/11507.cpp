#include <bits/stdc++.h>

using namespace std;

map< string, map<string, string>  > mp;
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    mp["+x"]["+y"] = "+y";
    mp["+x"]["-y"] = "-y";
    mp["+x"]["+z"] = "+z";
    mp["+x"]["-z"] = "-z";
    mp["-x"]["+y"] = "-y";
    mp["-x"]["-y"] = "+y";
    mp["-x"]["+z"] = "-z";
    mp["-x"]["-z"] = "+z";

    mp["+y"]["+y"] = "-x";
    mp["+y"]["-y"] = "+x";
    mp["+y"]["+z"] = "+y";
    mp["+y"]["-z"] = "+y";
    mp["-y"]["+y"] = "+x";
    mp["-y"]["-y"] = "-x";
    mp["-y"]["+z"] = "-y";
    mp["-y"]["-z"] = "-y";

    mp["+z"]["+y"] = "+z";
    mp["+z"]["-y"] = "+z";
    mp["+z"]["+z"] = "-x";
    mp["+z"]["-z"] = "+x";
    mp["-z"]["+y"] = "-z";
    mp["-z"]["-y"] = "-z";
    mp["-z"]["+z"] = "+x";
    mp["-z"]["-z"] = "-x";

    int l;
    while(cin >> l) {
        if(l == 0) {
            break;
        }
        string c = "+x";
        for(int i = 0; i < l-1; ++i) {
            string d;
            cin >> d;
            if(d != "No") {
                c = mp[c][d];
            }
        }
        cout << c << "\n";
    }
    return 0;
}
