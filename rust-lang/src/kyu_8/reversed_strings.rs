// Complete the solution so that it reverses the string passed into it.

// 'world'  =>  'dlrow'
// 'word'   =>  'drow'

fn solution(phrase: &str) -> String {
    phrase.chars().rev().collect::<String>()
}

#[cfg(test)]
mod tests {
    use super::*;
    use rstest::rstest;

    #[rstest]
    #[case("world", "dlrow")]
    #[case("word", "drow")]
    #[case("h", "h")]
    #[case("", "")]
    fn sample_test(#[case] phrase: &str, #[case] expected: &str) {
        assert_eq!(solution(phrase), expected);
    }
}
