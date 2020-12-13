package com.tanki.flashcards.repository

import com.tanki.flashcards.api.RetrofitInstance
import com.tanki.flashcards.model.Deck

class Repository {

        suspend fun getDeck(): Deck {
           return  RetrofitInstance.api.getDeck()
        }
}