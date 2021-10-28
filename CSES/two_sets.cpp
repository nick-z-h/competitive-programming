#include <iostream>
#include <vector>

using namespace std;

vector<int> vec1;
vector<int> vec2;
int main() {
	int n;
	cin >> n;
	long long s1 = 0, s2 = 0;
	for (int i = n; i > 0; --i) {
		if (s1 <= s2) {
			vec1.push_back(i);
			s1 += i;
		} else {
			vec2.push_back(i);
			s2 += i;
		}
	}
	if (s1 == s2) {
		cout << "YES\n";
		cout << vec1.size() << "\n";
		for (int &x : vec1) {
			cout << x << " ";
		}
		cout << "\n" << vec2.size() << "\n";
		for (int &x : vec2) {
			cout << x << " ";
		}
		cout << "\n";
	} else {
		cout << "NO\n";
	}
	return 0;
}
