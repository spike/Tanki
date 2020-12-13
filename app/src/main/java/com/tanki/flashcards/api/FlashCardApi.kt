package com.tanki.flashcards.api

import com.tanki.flashcards.model.Card
import com.tanki.flashcards.model.Deck
import retrofit2.http.GET

interface FlashCardApi {

    @GET("decks/1")
    suspend fun getDeck(): Deck


    @GET("cards/1")
    suspend fun getCard(): Card

}

// @GET("33b43f3e-9678-42db-afe1-b597c926c6c0")