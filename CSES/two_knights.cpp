#include <iostream>

using namespace std;

int main() {
	int n;
	cin >> n;
	for (int i = 1; i <= n; ++i) {
		long long ta = i*i;
		long long res = ta*(ta-1)/2;
		if (i > 2) {
			res -= 4*(i-1)*(i-2);
		}
		cout << res << "\n";
	}
	return 0;
}
