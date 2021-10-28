#include <bits/stdc++.h>

using namespace std;

int mp[26];
int main() {
	string s;
	cin >> s;
	for (char &x: s) {
		++mp[x-'A'];
	}
	string front;
	string back;
	string mid;
	for (int i = 0; i < 26; ++i) {
		while (mp[i] >= 2) {
			front += (char)(i+'A');
			back += (char)(i+'A');
			mp[i] -= 2;
		}
		if (mp[i] == 1)
			mid += (char)(i+'A');
	}
	if (mid.size() > 1) {
		cout << "NO SOLUTION\n";
	} else {
		reverse(back.begin(), back.end());
		cout << front + mid  + back << "\n";
	}
	return 0;
}
