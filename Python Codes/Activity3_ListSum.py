n = int(input("Enter number of elements: "))

numbers= []

for i in range(n):
    value = int(input(f"Enter {i+1}th element: "))
    numbers.append(value)

total = 0

for num in numbers:
    total += num

print(f"Sum of elements: {total}")