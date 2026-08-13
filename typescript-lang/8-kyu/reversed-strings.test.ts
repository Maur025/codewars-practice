import { assertEquals } from "@std/assert";
import { solution } from "./reversed-strings.ts";

Deno.test.each([
  { str: "world", expected: "dlrow" },
  { str: "hello", expected: "olleh" },
  { str: "", expected: "" },
  { str: "h", expected: "h" },
  { str: "😀", expected: "😀" },
])("Should return a string", ({ str, expected }): void => {
  assertEquals(solution(str), expected);
});
