"""
Create a function that takes a list and string. The function should remove the letters in the string from the list,
 and return the list.
"""


# below the algorithm solves the above problem
def remove_letters(list: list[str], word: str):
    for i in word:
        if i in list:
            list.remove(i)
    return list