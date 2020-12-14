package com.tanki.flashcards.repository

import com.tanki.flashcards.api.RetrofitInstance
import com.tanki.flashcards.model.Deck
import retrofit2.Response

class Repository {

        suspend fun getDeck(): Response<Deck> {
           return  RetrofitInstance.api.getDeck()
        }

        suspend fun getDeck2(number: Int): Response<Deck> {
            return RetrofitInstance.api.getDeck2(number)
        }

        suspend fun getDecks(number: Int): Response<List<Deck>> {
            return RetrofitInstance.api.getDecks(number)
        }
}