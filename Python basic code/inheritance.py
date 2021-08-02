class baba:
    age = 40
     
    def showdetails(self):
        # print("Father ")
        print("Age is  " , self.age)

#single inheritance
class chele(baba):
    age=16
  
    def showdetails(self):
        print("Bap er chele")
        super().showdetails()
     

    



#multilevel inheritance
# class nati(chele):
#     age=6

#hiererchical inheritance
# class nati(baba):
#     age=6

#multiple inheritace
# class chele:
#     age=16
# class nati(baba,chele):
#     age=6
       


       
pita=baba()
pita.showdetails()

putro=chele()
putro.showdetails()

# kochi=nati()
# kochi.showdetails()
