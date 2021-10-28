#include <iostream>

using namespace std;

int main() {
	int t;
	cin >> t;
	while (t--) {
		long long a, b;
		cin >> a >> b;
		cout << (((a+b)%3==0 && (a*2 >= b) && (b*2>=a))? "YES" : "NO") << "\n";
	}
	return 0;
}
