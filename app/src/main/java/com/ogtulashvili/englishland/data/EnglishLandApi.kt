package com.ogtulashvili.englishland.data

import retrofit2.http.GET
import io.reactivex.rxjava3.core.Single

interface EnglishLandApi {

    @GET("./getWordsList")
    fun GetWordsList(): Single<HelloWordResponse>

    }