// Given a string of arbitrary length with any ascii characters. Write a function to determine whether the string contains the whole word "English".
// The order of characters is important -- a string "abcEnglishdef" is correct but "abcnEglishsef" is not correct.
// Upper or lower case letter does not matter -- "eNglisH" is also correct.
// Return value as boolean values, true for the string to contains "English", false for it does not.

fn sp_eng(sentence: Option<&str>) -> bool {
    sentence.map_or(false, |s| s.to_lowercase().contains("english"))
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case(Some("english"), true)]
    #[case(Some("engliish"), false)]
    #[case(Some("1234egn lis;h"), false)]
    #[case(Some("1234english ;k"), true)]
    #[case(Some("English"), true)]
    #[case(Some("eNgliSh"), true)]
    #[case(Some("1234#$%%eNglish ;k9"), true)]
    #[case(Some("EGNlihs"), false)]
    #[case(Some("1234englihs**"), false)]
    #[case(Some(""), false)]
    #[case(None, false)]
    fn should_return_false_or_true_when_sentence_compare_to_english(
        #[case] sentence: Option<&str>,
        #[case] expected: bool,
    ) {
        assert_eq!(sp_eng(sentence), expected)
    }
}
