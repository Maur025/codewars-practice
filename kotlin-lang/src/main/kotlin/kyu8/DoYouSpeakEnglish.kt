package com.maur025.java.lang.kyu8

const val EXPECTED_FRASE = "english"

fun doYouSpeakEnglish(sentence: String?): Boolean {
    if (sentence == null) {
        return false
    }

    val sentenceNormalized = sentence.trim().lowercase()

    return sentenceNormalized.contains(EXPECTED_FRASE)
}