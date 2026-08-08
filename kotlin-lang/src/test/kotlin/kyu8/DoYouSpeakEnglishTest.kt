package kyu8

import com.maur025.java.lang.kyu8.doYouSpeakEnglish
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.NullAndEmptySource
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class DoYouSpeakEnglishTest {

    @ParameterizedTest
    @CsvSource(
        "english,true",
        "egnlish,false",
        "engliish,false",
        "'1234egn lis;h',false",
        "'1234english ;k',true",
        "English,true",
        "eNgliSh,true",
        "'1234#\$%%eNglish ;k9',true",
        "EGNlihs,false",
        "1234englihs**,false"
    )
    fun `should return true or false when sentence compare to text english`(
        sentence: String, expected: Boolean
    ) {
        val result = doYouSpeakEnglish(sentence)

        assertEquals(expected, result)
    }


    @ParameterizedTest
    @NullAndEmptySource
    fun `should return false when sentence is null or Empty`(
        sentence: String?
    ) {
        val result = doYouSpeakEnglish(sentence)

        assertFalse(result)
    }
}