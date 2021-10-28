#include <iostream>

using namespace std;

int main() {
	long long n;
	cin >> n;
	long long res = 0;
	for (long long i = 5; i <=n; i*=5) {
		res += n/i;
	}
	cout << res << "\n";
	return 0;
}
