package com.tanki.flashcards.model

data class Deck (
    val deckId: Int,
    val topic: String,
    val userId: Int,
    val size: Int,
    val due: Int
)
