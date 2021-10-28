#include <iostream>

using namespace std;

int main() {
	int t;
	cin >> t;
	while (t--) {
		long long x, y, res;
		cin >> y >> x;
		long long z = max(x, y);
		if (z%2 == 0) {
			if (y == z) {
				res = z*z-x+1;
			} else {
				--z;
				res = z*z+y;
			}
		} else {
			if (y == z) {
				--z;
				res = z*z+x;
			} else {
				res = z*z-y+1;
			}
		}
		cout << res << "\n";
	}
	return 0;
}
