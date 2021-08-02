msg = "hello d" 
print(msg)


x = " Hello  "

print (x)
 
print (x.strip())
print (len(x))

var = x.lower()
var = x.upper()
var = x.replace("l" , "o")

print (var)

s = "he is a hot "
d = "kutti"
m=  "murti"
f = "she is  not a"

hd = " This is not a  {1}  this is a {0} hello ggg " .format(d , m)
dh= f" This is not a  {d}  this is a {m} hello ggg "
print (hd)
print (dh)