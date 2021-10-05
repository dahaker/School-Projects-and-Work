# Calculator,
bill_total = input("Please enter the bill total: ")
# int()=integer conversion
bill = int(bill_total)
tip_number = input("Please enter your desired tip percentage: ")
tip_percentage = int(tip_number) / 100
tax_number = input("Please enter your sales tax percent: ")
tax_percentage = int(tax_number) / 100

# Remember f "string" to add other types of units
tip = bill * tip_percentage
print(f"Tip: {tip}")

tax = bill * tax_percentage
print(f"Tax: {tax}")

total = bill + tip + tax
print(f"Total: {total}")