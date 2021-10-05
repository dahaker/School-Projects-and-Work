# Program from the boot camp
# Program from the boot camp
# with Function to open file, f.write write it, then f.close close it
# len() = length of the entry
# Condition while, if

sentence = input("Enter a sentence: ")
sentence_length = len(sentence)
print(sentence_length)

file_name = input("Enter your File name: ")
file_name = f"{file_name}.txt"

with open(file_name, "w")as f:
    f.write(sentence)
    f.close()

print(f"You've written {sentence_length} characters to {file_name}")

decision = input("Would you like to add more sentences? Type Yes or No")


while decision == 'Yes' or 'yes':
    sentence1 = input("Enter a sentence: ")

    with open(file_name, "a")as f:
        f.write(f"\n {sentence1}")
        f.close()
        sentence_length1 = len(sentence1)
    print(f"You've written {sentence_length1} characters to {file_name}")
    decision = input("Would you like to add more sentences? Type Yes or No")
else:
    print(f"You've written {sentence_length} characters to {file_name}")
