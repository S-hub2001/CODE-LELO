list1 = [1, 2, 3, 4, 1, 1, 1, 4, 5,"happy","happy"]

c=0
for i in list1:
    if (list1.index(i)==c):
        print(i,"  ",list1.count(i))
    c=c+1


 # or usin dictionary


# str= [1, 2, 3, 4, 1, 1, 1, 4, 5,"happy","happy"]
# dic={}
# for i in str:
#     if i in dic:
#         dic[i]+=1
#     else:
#         dic[i] =1
# print(dic)