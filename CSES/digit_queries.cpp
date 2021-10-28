#include <iostream>

using namespace std;

int main() {
	long long p10[19];
	p10[0] = 1;
	for (int i = 1; i < 19; ++i) {
		p10[i] = p10[i-1] * 10;
	}
	int q;
	long long k;
	cin >> q;
	while (q--) {
		cin >> k;
		if (k < 10) {
			cout << k << "\n";
		} else {
			int num_of_digits = 0;
			long long digits_of_prev = 0;
			long long digits_of_cur = 0;
			for (int i = 1; i < 19; ++i) {
				digits_of_cur += (p10[i] - p10[i-1])*i;
				if (digits_of_cur >= k) {
					num_of_digits = i;
					break;
				}
				digits_of_prev += (p10[i]-p10[i-1])*i;
			}
			long long l = p10[num_of_digits-1], r = p10[num_of_digits]-1;
			long long sol = 0;
			long long sol_pos;
			while (l <= r) {
				long long mid = (r-l)/2 + l;
				long long mid_pos = digits_of_prev + 1 + (mid - p10[num_of_digits-1])*num_of_digits;
				if (mid_pos <= k) {
					if (mid > sol) {
						sol = mid;
						sol_pos = mid_pos;
					}
					l = mid + 1;
				} else {
					r = mid -1;
				}
			}
			string res = to_string(sol);
			cout << res[k-sol_pos] << "\n";
		}
	}
	
	return 0;
}
