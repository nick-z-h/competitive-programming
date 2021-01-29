#include <bits/stdc++.h>

using namespace std;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	int t;
	cin >> t;
	for (int l = 0; l < t; ++l) {
		int n;
		cin >> n;
		int a[n*3];
		for (int i = 0; i < n*3; ++i) {
			cin >> a[i];
		}
		sort(a, a+n*3, greater<int>());
		int c = 0;
		for (int i = 0; i < n; ++i) {
			c += a[i*2+1];
		}
		cout << c << "\n";
	}
	return 0;
}
