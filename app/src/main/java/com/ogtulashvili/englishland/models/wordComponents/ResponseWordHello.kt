package com.ogtulashvili.englishland.models.wordComponents

import com.fasterxml.jackson.annotation.JsonProperty

data class ResponseWordHello(
    @JsonProperty("word") var word: String,
    @JsonProperty("origin") var origin: String,
    @JsonProperty("definition") var definition: String,
)
