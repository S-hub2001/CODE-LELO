class Employee:
    company = "Google" #company= class atribute
    salary = 100

harry = Employee()  #harry= object+instance
rajni = Employee()

rajni.salary=2000

# harry.salary = 300   #salary= intance atribute
# rajni.salary = 400
# harry.company="you tube"

print(harry.salary)
print(rajni.salary)
print(harry.company)

Employee.company = "YouTube"



print(harry.company)  
print(rajni.company)
print(harry.salary)
print(rajni.salary)