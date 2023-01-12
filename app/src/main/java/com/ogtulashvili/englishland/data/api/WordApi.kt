package com.ogtulashvili.englishland.data.api

import com.ogtulashvili.englishland.models.wordComponents.ResponseWordHello
import retrofit2.Call
import retrofit2.http.GET

interface WordApi {
    @GET("entries/en/hello")
    fun getWordHello(): Call<ResponseWordHello>
}