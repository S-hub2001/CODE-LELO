open("employees.txt" , "r")
open("employees.txt" , "w")
open("employees.txt" , "a")
open("employees.txt" , "r+")

employees_file = open("D:\Python\employees.txt" , "r")
print(employees_file.readable())
employees_file.close()

employees_file = open("D:\Python\employees.txt" , "r")
print(employees_file.read())
employees_file.close()

employees_file = open("D:\Python\employees.txt" , "r")
print(employees_file.readline())
print(employees_file.readline())
employees_file.close()

employees_file = open("D:\Python\employees.txt" , "r")
print(employees_file.readlines())
employees_file.close()

employees_file = open("D:\Python\employees.txt" , "r")

print(employees_file.readlines()[1])
employees_file.close()



employees_file = open("D:\Python\employees.txt" , "r")

for employee in employees_file.readlines():
    print(employee)
employees_file.close()
