#include <bits/stdc++.h>

using namespace std;

int a[10001];
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	int n;
	while (cin >> n) {
		int m, x, y;
		for (int i = 0; i < n; ++i) {
			cin >> a[i];
		}
		sort(a, a+n);
		cin >> m;
		int l = 0, r = n-1;
		while (l < r) {
			if (a[l] + a[r] < m) {
				++l;
			} else if (a[l] + a[r] == m) {
				x = l;
				y = r;
				++l;
				--r;
			} else {
				--r;
			}
		}
		cout << "Peter should buy books whose prices are " << a[x] << " and " << a[y] << ".\n\n";
	}
	return 0;
}
