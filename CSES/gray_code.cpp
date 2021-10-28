#include <iostream>
#include <cmath>
#include <vector>
#include <bitset>

using namespace std;

string getBits(int n, int sz) {
	string res;
	while (n != 0) {
		res = (n%2==0?"0":"1") + res;
		n /= 2;
	}
	while (res.size() < sz) {
		res = "0" + res;
	}
	return res;
}

int main() {
	int n;
	cin >> n;
	vector<int> vec;
	vec.push_back(0);
	for (int i = 0; i < n; ++i) {
		int sz = vec.size();
		for (int j = sz - 1; j >= 0; --j) {
			vec.push_back(vec[j] | 1 << i);
		}
	}
	for (int &x: vec) {
		cout << getBits(x, n) << "\n";
	}
	return 0;
}
