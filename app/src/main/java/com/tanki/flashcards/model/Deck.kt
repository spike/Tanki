package com.tanki.flashcards.model

data class Deck (
    val deckId: Int,
    val topic: String,
    val userId: Int,
    // val color: String,
    val size: Int,
    val due: Int
)
