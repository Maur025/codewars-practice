from operator import contains

# Given a string of arbitrary length with any ascii characters. Write a function to determine whether the string contains the whole word "English".

# The order of characters is important -- a string "abcEnglishdef" is correct but "abcnEglishsef" is not correct.

# Upper or lower case letter does not matter -- "eNglisH" is also correct.

# Return value as boolean values, true for the string to contains "English", false for it does not.

EXPECTED_FRASE = "english"


def sp_eng(sentence: str):
    if sentence is None:
        return False

    sentence_normalized = sentence.strip().lower()
    return contains(sentence_normalized, EXPECTED_FRASE)
