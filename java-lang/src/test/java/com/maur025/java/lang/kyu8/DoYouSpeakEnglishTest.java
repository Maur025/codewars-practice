package com.maur025.java.lang.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

class DoYouSpeakEnglishTest {

    private DoYouSpeakEnglish doYouSpeakEnglish;

    @BeforeEach
    void setUp() {
        doYouSpeakEnglish = new DoYouSpeakEnglish();
    }

    @ParameterizedTest
    @DisplayName("should return true if the input string is 'English', false otherwise")
    @CsvSource({"english,true", "egnlish,false", "engliish,false", "'1234egn lis;h',false",
        "'1234english ;k',true", "English,true", "eNgliSh,true", "'1234#$%%eNglish ;k9',true",
        "EGNlihs,false", "1234englihs**,false"})
    void shouldReturnTrueIfInputStringIsEnglish(String sentence, boolean expected) {
        // WHEN
        boolean result = doYouSpeakEnglish.process(sentence);
        // THEN
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @DisplayName("should return false if the input string is empty or null")
    void shoulReturnFalse_emptyOrNullSentence(String sentence) {
        // WHEN
        boolean result = doYouSpeakEnglish.process(sentence);
        // THEN
        assertFalse(result);
    }
}