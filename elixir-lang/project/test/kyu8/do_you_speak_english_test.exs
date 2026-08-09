defmodule Kyu8.DoYouSpeakEnglishTest do
  use ExUnit.Case

  alias Kyu8.DoYouSpeakEnglish

  @test_cases [
    {"english", true},
    {"engliish", false},
    {"1234egn lis;h", false},
    {"1234english ;k", true},
    {"English", true},
    {"eNgliSh", true},
    {"1234#$%%eNglish ;k9", true},
    {"EGNlihs", false},
    {"1234englihs**", false},
    {"", false, "empty"},
    {nil, false, "nil"}
  ]

  for {sentence, expected, other_name} <- @test_cases do
    test "should return false or true when sentence compare to 'english', case #{sentence}#{other_name}-#{expected}" do
      assert DoYouSpeakEnglish.sp_eng(unquote(sentence)) == unquote(expected)
    end
  end
end
