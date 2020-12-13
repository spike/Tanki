package com.tanki.flashcards.api

import com.tanki.flashcards.model.Card
import com.tanki.flashcards.model.Deck
import retrofit2.Response
import retrofit2.http.GET

interface FlashCardApi {

    @GET("decks/1")
    suspend fun getDeck(): Response<Deck>


    @GET("cards/1")
    suspend fun getCard(): Card

}