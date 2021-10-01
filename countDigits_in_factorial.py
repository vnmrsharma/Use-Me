# Count the number of digits in a factorial
countDigit = 0
n = int(input("Enter the number: "))
if (n<0):
    print("Not defined for less then zero")
if (n<=1):
    print("1")

for i in range(2, n+1):
    countDigit = countDigit+i

countDigitstr = str(countDigit)

l = len(countDigitstr)
print(l+1)
