num = [7,8, 120, 25, 44, 20, 27]



nu=[]

for x in num:
    if x%2!=0:
     nu.append(x)
    


print(nu)

# other way
num = [x for x in num if x%2!=0]
print(num)