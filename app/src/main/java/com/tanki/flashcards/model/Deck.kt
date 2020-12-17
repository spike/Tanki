package com.tanki.flashcards.model

data class Deck (
    val deckId: Int,
    val topic: String,
    val userId: Int,
    // val color: String,
    // val priority: Int,
    // val numberOfCardsDue: Int,
    // val archived: Boolean,
    // val suspended: ??
    // val whiteboardEnabled: Boolean,
    val size: Int,
    // val hash: Int, // (for testing uniqueness of the deck)
    val due: Int
    // will need to change due to an actual date
)
