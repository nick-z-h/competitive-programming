#include <bits/stdc++.h>

using namespace std;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);
	int n, b;
	while (cin >> n >> b) {
		if (n == -1 && b == -1) {
			break;
		}
		priority_queue<pair<int, pair<int, int>>> pq;
		for (int i = 0; i < n; ++i) {
			int t;
			cin >> t;
			pq.push({t, {t, 1}});
			--b;
		}
		for (int i = 0; i < b; ++i) {
			pair <int, int> t = pq.top().second;
			int a = t.first;
			int b = t.second+1;
			int c = ceil(double(a)/b);
			pq.pop();
			pq.push({c, {a, b}});
		}
		cout << pq.top().first << "\n";
	}
	return 0;
}
