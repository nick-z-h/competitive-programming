#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
	string s;
	cin >> s;
	sort(s.begin(), s.end());
	vector<string> sol;
	do {
		sol.push_back(s);
	} while (next_permutation(s.begin(), s.end()));
	cout << sol.size() << "\n";
	for (string &x: sol) {
		cout << x << "\n";
	}
	return 0;
}
