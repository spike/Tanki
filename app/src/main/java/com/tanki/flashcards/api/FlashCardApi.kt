package com.tanki.flashcards.api

import com.tanki.flashcards.model.Card
import com.tanki.flashcards.model.Deck
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface FlashCardApi {

    @GET("decks/1")
    suspend fun getDeck(): Response<Deck>

    @GET("decks/{deckNumber}")
    suspend fun getDeck2(
            @Path("deckNumber") number: Int
    ): Response<Deck>

    @GET("decks")
    suspend fun getDecks (
            @Query("userId") number: Int
    ): Response<List<Deck>>


    @GET("cards/1")
    suspend fun getCard(): Card

}