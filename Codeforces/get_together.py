import sys

n = int(sys.stdin.readline())
p = []
v = []

for i in range(n):
    s = sys.stdin.readline().split()
    p.append(int(s[0]))
    v.append(int(s[1]))

l = 0
r = 1e9
for i in range(100):
    mid = l + (r - l) / 2
    f = True
    l_r = -1e9
    r_r = 1e9
    for i in range(n):
        l_p = p[i] - v[i] * mid
        r_p = p[i] + v[i] * mid
        if l_p > r_r or r_p < l_r:
            f = False
            break
        l_r = max(l_r, l_p)
        r_r = min(r_r, r_p)

    if f:
        r = mid
    else:
        l = mid
print(r)
