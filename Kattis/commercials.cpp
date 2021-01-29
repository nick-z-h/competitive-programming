#include <bits/stdc++.h>

using namespace std;

int a[100001];
int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	int n, p;
	cin >> n >> p;
	for (int i = 0; i < n; ++i) {
		cin >> a[i];
		a[i] -= p;
	}
	int m1 = 0, m2 = 0;
	for (int i = 0; i < n; ++i) {
		m1 = max(0, m1 + a[i]);
		m2 = max(m1, m2);
	}
	cout << m2 << "\n";
	return 0;
}
