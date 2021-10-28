#include <iostream>

using namespace std;

int main() {
	int n;
	cin >> n;
	long long cur, prev;
	cin >> prev;
	long long res = 0;
	for (int i = 1; i < n; ++i) {
		cin >> cur;
		if (cur - prev < 0) {
			res += prev - cur;
			cur += prev - cur;
		}
		prev = cur;
	}
	cout << res;
	return 0;
}
