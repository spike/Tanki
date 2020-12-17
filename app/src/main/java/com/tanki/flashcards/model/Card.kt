package com.tanki.flashcards.model

import java.util.*

data class Card(
    val id: Int,
    val deckId: Int,
    val front: String,
    val back: String,
    // archived: Boolean
    // suspended: Boolean
    // whiteboardEnabled: Boolean (check parent deck first)
    // val nextDue: Date
    val nextDue: Int
)