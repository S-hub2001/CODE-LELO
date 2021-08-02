# a = [10,20,30,20,10,50,60,40,80,50,40]

# dup_items = set()
# uniq_items = []
# for x in a:
#     if x not in dup_items:
#         uniq_items.append(x)
#         dup_items.add(x)

# print(dup_items)


list = [1, 3, 5, 6, 3, 5, 6, 1]
print ("The original list is : " +  str(list))

res = []

for i in list:
    if i not in res:
        res.append(i)


print ("The list after removing duplicates : " + str(res))

# my_list = [1, 3, 5, 6, 3, 5, 6, 1]
# print("Original List : ", my_list)
# my_set = set(my_list)
# my_new_list = list(my_set)
# print("List of unique numbers : ", my_new_list)
