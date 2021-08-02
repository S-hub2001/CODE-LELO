# salary=int(input("Enter your salary = "))
# year_of_service=int(input("Enter year of service = "))

# if year_of_service >5:
#    print(f"Your saalary is={salary+(salary*5/100)}")
# else:
#     print("your salary = ", salary)


class company:
    salary = 30000

    #  def data(self):

    def __init__(self, name, year_of_service):
        self.name = name
        self.year_of_service = year_of_service

        if self.year_of_service > 5:
            print(f"{self.name} your saalary is={self.salary+(self.salary*5/100)}")
        else:
            print(f"{self.name} your saalary is={self.salary}")

    @staticmethod
    def dat():
        print("thank you")


# souvik = company()
# tanay = company()
# tanmay = company()
# tanay.salary=50000
a = int(input("enter you year_of_service = "))
b = int(input("enter your year_of_service = "))
c = int(input("enter youryear_of_service = "))

souvik = company("souvik", a)
tanay = company("tanay", b)
tanmay = company("tanmay", c)
tanay.dat()


# souvik.year_of_service = a
# tanay.year_of_service = b
# tanmay.year_of_service = c


# souvik.data()
# tanay.data()
# tanmay.data()
