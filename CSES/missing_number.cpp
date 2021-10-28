#include <iostream>

using namespace std;

int main() {
	long long n, c = 0;
	cin >> n;
	for (int i = 0; i < n-1; ++i) {
		int t;
		cin >> t;
		c += t;
	}
	long long res = n*(n+1)/2 - c;
	cout << res << "\n";
}
