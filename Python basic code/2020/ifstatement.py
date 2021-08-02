# is_male = True 

# if is_male :
#     print ("You are male")
# else:
#      print("You are not a male")

# is_male = True 
# is_tall = True

# if is_male or is_tall  :
#     print ("You are male or tall both")
# else:
#      print("You are not a male not tall")


is_male = False
is_tall = True

if is_male and is_tall  :
    print ("You are male or tall male")

elif is_male and not(is_tall):
    print("You are a short male")

elif not(is_male) and is_tall:
    print("You are not a male but tall")
else:
     print("You are either not a maleand not tall")