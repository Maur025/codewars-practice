import { spEng } from "./do-you-speak-english.ts";
import { assertEquals } from "@std/assert";

Deno.test.each([
  {
    sentence: "english",
    expected: true,
  },
  { sentence: "egnlish", expected: false },
  { sentence: "engliish", expected: false },
  { sentence: "1234egn lis;h", expected: false },
  { sentence: "1234english ;k", expected: true },
  { sentence: "English", expected: true },
  { sentence: "eNgliSh", expected: true },
  { sentence: "1234#$%%eNglish ;k9", expected: true },
  { sentence: "EGNlihs", expected: false },
  { sentence: "1234englihs**", expected: false },
  { sentence: "", expected: false },
  { sentence: undefined, expected: false },
  { sentence: null, expected: false },
])(
  "should return false or true when sentence compare to 'english'",
  ({ sentence, expected }): void => {
    assertEquals(spEng(sentence), expected);
  },
);
