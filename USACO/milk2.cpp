/*
ID: nzh
TASK: milk2
LANG: C++        
*/

#include <iostream>
#include <fstream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    ofstream fout("milk2.out");
    ifstream fin("milk2.in");
    int n, m1 = 0, m2 = 0;
    fin >> n;
    vector<pair<int,int>> v;
    for(int i = 0; i < n; ++i) {
        int a, b;
        fin >> a >> b;
        v.push_back({a, b});
    }
    sort(v.begin(), v.end());
    int start = v[0].first, max_end = v[0].second, max_milking = max_end - start, max_idle = 0;
    for(int i = 1; i < n; ++i) {
        if(v[i].first <= max_end) {
            max_end = max(max_end, v[i].second);
        } else {
            max_milking = max(max_milking, max_end - start);
            max_idle = max(max_idle, v[i].first - max_end);
            start = v[i].first;
            max_end = v[i].second;
        }
    }
    fout << max_milking << " " << max_idle << "\n";
    return 0;
}
