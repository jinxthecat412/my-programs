yes = ('Correct!')
no = ('Incorrect!')

import random
import math
rand1 = 0
rand2 = 0

def addition():
    rand1 = random.randint(1, 999)
    rand2 = random.randint(1, 999)
    int1 = float(input("What is " + str(rand1) + " + " + str(rand2) + "? "))
    rand3 = rand1 + rand2
    if int1 == rand3:
        print(yes)
        print()
        print(selection())
        return("")
    else:
        print(no)
        print("The correct answer is: " + str(rand3))
        print()
        print(selection())
        return("")

def subtraction():
    rand1 = random.randint(1, 999)
    rand2 = random.randint(1, 999)
    int2 = float(input("What is " + str(rand1) + " - " + str(rand2) + "? "))
    rand4 = rand1 - rand2
    if int2 == rand4:
        print(yes)
        print()
        print(selection())
        return("")  
    else:
        print(no)
        print("The correct answer is: " + str(rand4))
        print()
        print(selection())
        return("")
    
def multiplication():
    rand1 = random.randint(1, 999)
    rand2 = random.randint(1, 999)
    int3 = float(input("What is " + str(rand1) + " * " + str(rand2) + "? "))
    rand5 = rand1 * rand2
    if int3 == rand5:
        print(yes)
        print()
        print(selection())
        return("")
    else:
        print(no)
        print("The correct answer is: " + str(rand5))
        print()
        print(selection())
        return("")

def division():
    rand1 = random.randint(1, 999)
    rand2 = random.randint(1, 999)
    int4 = float(input("What is " + str(rand1) + " / " + str(rand2) + "? "))
    rand6 = rand1 / rand2
    if int4 == rand6:
        print(yes)
        print()
        print(selection())
        return("")
    else:
        print(no)
        print("The correct answer is: " + str(rand6))
        print()
        print(selection())
        return("")

def power():
    rand1 = random.randint(1, 250)
    rand2 = random.randint(1, 250)
    int5 = float(input("What is " + str(rand1) + " to the power of " + str(rand2) + "? "))
    rand7 = rand1 ** rand2
    if int5 == rand7:
        print(yes)
        print()
        print(selection())
        return("")
    else:
        print(no)
        print("The correct answer is: " + str(rand7))
        print()
        print("i dont expect you to have taken the time to input that")
        print("nor can any calculator output that entire number with abreviating")
        print("this option is pretty much a joke")
        print()
        print(selection())
        return("")

def mod():
    rand1 = random.randint(1, 999)
    rand2 = random.randint(1, 999)
    int6 = float(input("What is the remainder of " + str(rand1) + " / " + str(rand2) + "? "))
    rand8 = rand1 % rand2
    if int6 == rand8:
        print(yes)
        print()
        print(selection())
        return("")
    else:
        print(no)
        print("The correct answer is: " + str(rand8))
        print()
        print(selection())
        return("")
        
def sqrt():
    rand1 = random.randint(1, 999)
    rand2 = random.randint(1, 999)
    rand9 = rand1 + rand2
    int7 = float(input("What is the square root of " + str(rand9) + "? "))
    square = math.sqrt(rand9)
    if int7 == square:
        print(yes)
        print()
        print(selection())
        return("")
    else:
        print(no)
        print("The correct answer is: " + str(square))
        print()
        print(selection())
        return("")
    
def selection():
    print()
    print("cool random math questions by jinxthecat412:")
    print()
    print("1. Addition")
    print("2. Subtraction")
    print("3. Multiplication")
    print("4. Division")
    print("5. Power")
    print("6. Remainder")
    print("7. Square root")
    print("8. Exit Program")
    j = int(input("Enter a number 1-8: "))
    if j == 0 or j < 1 or j > 8:
        print()
        print(selection())
    if j == 1:
        print()
        print(addition())
    if j == 2:
        print()
        print(subtraction())
    if j == 3:
        print()
        print(multiplication())
    if j == 4:
        print()
        print(division())
    if j == 5:
        print()
        print(power())
    if j == 6:
        print(mod())
    if j == 7:
        print(sqrt())
    if j == 8:
        exit()
    return("")

print(selection())

