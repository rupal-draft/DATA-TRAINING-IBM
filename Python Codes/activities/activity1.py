# Write a program that asks the user to enter their name and their age.
# Print out a message addressed to them that tells them the year that they will turn 100 years old.


name = input("Enter your name: ")
age = int(input("Enter your current age: "))

year_100 = (2026 - age) + 100

print(f"You will turn 100 in {year_100}")