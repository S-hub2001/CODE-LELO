# class Employee:
#     def__init__(self , gname , gsalary ):
#     self.name = gname 
#     self.salary = gsalary

# harry = Employee ("harry" , 34 )
# print(harry , salary )


class Student:
        def __init__(self, name, major, gpa, is_on_probation ):
            
            self.name = name 
            self.major = major 
            self.gpa = gpa
            self.is_on_probation = is_on_probation 

        def on_honor_roll(self):
            if self.gpa >= 3.5:
                 return True
            else:
                 return False

            
# A Sample class with init method   
# class Person:   
      
#     # init method or constructor    
#     def __init__(self, name):   
#         self.name = name   
      
#     # Sample Method    
#     def say_hi(self):   
#         print('Hello, my name is', self.name)   
      
# p = Person('Nikhil')   
# p.say_hi() 