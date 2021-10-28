#include <bits/stdc++.h>

using namespace std;

string s[8];
int col[8];
bool d[15];
int main() {
	for (int i = 0; i < 8; ++i) {
		cin >> s[i];
	}
	int c = 0;
	iota(col, col + 8, 0);
	do {
		bool f = true;
		for (int i = 0; i < 8; ++i) {
			if (s[i][col[i]] != '.') {
				f = false;
				break;
			}
		}
		memset(d, false, 15);
		for (int i = 0; i < 8; ++i) {
			if (d[i+col[i]]) {
				f = false;
			}
			d[i+col[i]] = true;
		}
		memset(d, false, 15);
		for (int i = 0; i < 8; ++i) {
			if (d[i+7-col[i]]) {
				f = false;
			}
			d[i+7-col[i]] = true;
		}
		if (f) {
			++c;
		}
	} while (next_permutation(col, col+8));
	cout << c << "\n";
	return 0;
}
