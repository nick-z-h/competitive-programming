#include <iostream>

using namespace std;

int main() {
	string s;
	cin >> s;
	int res = 1, prev = s[0], cur = 1;
	for (int i = 1; i < s.size(); ++i) {
		if (prev == s[i]) {
			++cur;
		} else {
			cur = 1;
		}
		res = max(res, cur);
		prev = s[i];
	}
	cout << res << "\n";
	return 0;
}
