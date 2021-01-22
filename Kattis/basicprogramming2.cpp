#include <bits/stdc++.h>

using namespace std;

int main() {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
        int n, t;
        cin >> n >> t;
        int a[n];
        for (int i = 0; i < n; ++i) {
                cin >> a[i];
        }
        switch (t) {
                case 1: {
                                bool f = false;
                                sort(a, a+n);
                                for (int i = 0; i < n; ++i) {
                                        int x = 7777 - a[i];
                                        if (binary_search(a, a+n, x)) {
                                                f = true;
                                                break;
                                        }
                                }
                                if (f) {
                                        cout << "Yes\n";
                                } else {
                                        cout << "No\n";
                                }
                                break;
                        }
                case 2: {
                                bool fl = true;
                                unordered_set<int> s;
                                for (int i = 0; i < n; ++i) {
                                        if(s.find(a[i]) == s.end()) {
                                                s.insert(a[i]);
                                        } else {
                                                fl = false;
                                        }
                                }
                                if (fl) {
                                        cout << "Unique\n";
                                } else {
                                        cout << "Contains duplicate\n";
                                }
                                break;
                        }

                case 3: {
                                unordered_map<int, int> mp;
                                bool fll = false;
                                for (int i = 0; i < n; ++i) {
                                        if (mp.find(a[i]) == mp.end()) {
                                                mp.insert({a[i], 1});
                                        } else {
                                                ++mp[a[i]];
                                                if (mp[a[i]] > n/2) {
                                                        cout << a[i] << "\n";
                                                        fll = true;
                                                        break;
                                                }
                                        }
                                }
                                if (!fll) {
                                        cout << -1 << "\n";
                                } 
                                break;
                        }
                case 4: {
                                sort(a, a+n);
                                if (n%2 == 0) {
                                        cout << a[n/2 -1] << ' ' << a[n/2] << "\n";
                                } else {
                                        cout << a[n/2] << "\n"; 
                                }
                                break;
                        }

                case 5: {
                                sort(a, a+n);
                                for (int i = 0; i < n; ++i) {
                                        if (a[i] >= 100 && a[i] <= 999) {
                                                cout << a[i] << " ";
                                        }
                                }
                                cout << "\n";
                                break;
                        }
        }
        return 0;
}
