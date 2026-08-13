import { describe, expect, test } from "vitest";
import { solution } from "./reversed-strings";

describe("Basic tests", () => {
  test.each([
    { str: "world", expected: "dlrow" },
    { str: "hello", expected: "olleh" },
    { str: "", expected: "" },
    { str: "h", expected: "h" },
    { str: "😀", expected: "😀" },
  ])("should return a reverse string, $str", ({ str, expected }) => {
    expect(solution(str)).toBe(expected);
  });
});
