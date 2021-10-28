#include <iostream>
#include <cmath>

using namespace std;

int main() {
	int n;
	cin >> n;
	long long res = 1;
	for (int i = 0; i < n; ++i) {
		res = res*2%(long long)(1e9+7);
	}
	cout << res << "\n";
	return 0;
}
