import { describe, it, assert } from "vitest";
import { spEng } from "./do-you-speak-english";
describe("Tests", () => {
	it.each([
		{ value: "english", expected: true },
		{ value: "egnlish", expected: false },
		{ value: "a", expected: false },
		{ value: "EnGlish", expected: true },
		{ value: "abcEnglishdef", expected: true },
		{ value: null, expected: false },
		{ value: undefined, expected: false },
		{ value: "", expected: false },
	])("should test example cases", ({ value, expected }) => {
		assert.strictEqual(spEng(value), expected);
	});
});
