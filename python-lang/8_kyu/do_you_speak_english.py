from operator import contains

EXPECTED_FRASE = "english"


def sp_eng(sentence: str):
    if sentence is None:
        return False

    sentence_normalized = sentence.strip().lower()
    return contains(sentence_normalized, EXPECTED_FRASE)
