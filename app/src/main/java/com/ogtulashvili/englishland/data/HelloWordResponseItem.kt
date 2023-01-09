package com.ogtulashvili.englishland.data

data class HelloWordResponseItem(
    val license: License,
    val meanings: List<Meaning>,
    val phonetics: List<Phonetic>,
    val sourceUrls: List<String>,
    val word: String
)