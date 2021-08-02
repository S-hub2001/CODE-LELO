class Employee:
    salary = 5600
    salarybonus = 400

    @property
    def totalsalary(self):
        return self.salary+self.salarybonus

    @totalsalary.setter
    def totalsalary(self, val):
        self.salarybonus = val-self.salary

    # def setsalary(self, val):
    #     self.salary = val
    @classmethod
    def setsalary(cls, val):
        cls.salary = val


tanmay = Employee()
souvik = Employee()
tanay = Employee()

souvik.setsalary(6000)
print(tanmay.salary)
print(souvik.salary)
print(tanay.salary)

print(tanay.totalsalary)
print(tanay.salary)
print(tanay.salarybonus)

tanay.totalsalary = 6500
print(tanay.totalsalary)
print(tanay.salary)
print(tanay.salarybonus)
