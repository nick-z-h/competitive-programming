#include <iostream>
#include <stack>
#include <cmath>

using namespace std;

void sol(int n, int s, int a, int e) {
	if (n == 1) {
		cout << s << " " << e << "\n";
		return;
	}
	sol(n-1, s, e, a);
	cout << s << " " << e << "\n";
	sol(n-1, a, s, e);
}

int main() {
	int n;
	cin >> n;
	if (n == 1) {
		cout << 1 << "\n";
		cout << 1 << " " << 3 << "\n";
		return 0;
	}
	if (n == 2) {
		cout << 3 << "\n";
		cout << 1 << " " << 2 << "\n";
		cout << 1 << " " << 3 << "\n";
		cout << 2 << " " << 3 << "\n";
		return 0;
	}
	cout << pow(2, n) -1 << "\n";
	sol(n, 1, 2, 3);
	return 0;
}
