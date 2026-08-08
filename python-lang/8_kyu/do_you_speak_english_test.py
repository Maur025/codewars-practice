import pytest

from do_you_speak_english import sp_eng


@pytest.mark.parametrize(
    "sentence,expected",
    [
        ("english", True),
        ("egnlish", False),
        ("engliish", False),
        ("1234egn lis;h", False),
        ("1234english ;k", True),
        ("English", True),
        ("eNgliSh", True),
        ("1234#$%%eNglish ;k9", True),
        ("EGNlihs", False),
        ("1234englihs**", False),
        ("", False),
        (None, False)
    ]
)
def test_example_cases(sentence: str, expected: bool):
    assert sp_eng(sentence) is expected
