n=5
for i in reversed(range(n+1)):
    for k in range(n-i):
        print(" ",end="")
    for j in range(i):
        print("* ",end="")
    print("")