package com.tanki.flashcards.repository

import com.tanki.flashcards.api.RetrofitInstance
import com.tanki.flashcards.model.Deck
import retrofit2.Response

class Repository {

        suspend fun getDecks(number: Int): Response<List<Deck>> {
            return RetrofitInstance.api.getDecks(number)
        }
/*        suspend fun getCards(number: Int): Response<List<Deck>> {
            return RetrofitInstance.api.getCards(number)
        }*/
}