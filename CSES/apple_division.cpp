#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>

using namespace std;

long long a[20];
int main() {
	int n;
	cin >> n;
	long long ms = 0, res = 0;
	for (int i = 0; i < n; ++i) {
		cin >> a[i];
		ms += a[i];
	}
	for (int i = 0; i < 1<<n; ++i) {
		long long cs = 0;
		for (int j = 0; j < n; ++j) {
			if (i & (1 << j)) {
				cs += a[j];
			}
		}
		if (cs <= ms/2) {
			res = max(res, cs);
		}
	}
	cout << ms - 2*res << "\n";
	return 0;
}
