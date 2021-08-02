a = [2, 3, 4, 5]

t = (a[0]+a[1]+a[2]+a[3])
print(t)

t = 0

for x in a:
    t += x

print(t)

print(sum(a))
