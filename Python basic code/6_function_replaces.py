



letter = ''' Dear <|n|>,

                        You are selected!

                                         <|b|>

'''



n= input("enter you name ")
b= input("enter date ")

letter = letter.replace("<|n|>", n) 
letter = letter.replace("<|b|>", b) 

print(letter )