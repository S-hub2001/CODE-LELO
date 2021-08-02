class Employee:
    company = "Google"

    def __init__(self, name, salary, subunit):
        self.name = name  # harry.name="Harry"
        self.salary = salary # harry.salary=100
        self.subunit = subunit  #harry.subunit="Youtube"
        print("Employee is created!") 

    def getDetails(self):
        print(f"The name of the employee is {self.name}")
        print(f"The salary of the employee is {self.salary}")
        print(f"The subunit of the employee is {self.subunit}")



harry = Employee("Harry", 100, "YouTube")

# harry = Employee()
# harry.name="Harry"
# harry.salary=100
# harry.subunit="Youtube"


harry.getDetails()

















    # def getSalary(self, signature):
    #     print(f"Salary for this employee working in {self.company} is {self.salary}\n{signature}")

    # @staticmethod
    # def greet():
    #     print("Good Morning, Sir")

    # @staticmethod
    # def time():
    #     print("The time is 9AM in the morning")