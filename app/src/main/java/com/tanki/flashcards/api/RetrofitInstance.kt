package com.tanki.flashcards.api

import com.tanki.flashcards.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://flashcards.free.beeceptor.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val api: FlashCardApi by lazy {
        retrofit.create(FlashCardApi::class.java)
    }


}
