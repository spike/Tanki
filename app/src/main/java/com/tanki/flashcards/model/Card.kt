package com.tanki.flashcards.model

import java.util.*

data class Card(
    val id: Int,
    val deckId: Int,
    val front: String,
    val back: String,
    val whiteboardEnabled: Boolean, // (check parent deck first)
    val author: String,
    val imported: Boolean,
    val archived: Boolean,
    val suspended: Boolean,
    val nextDue: Date,
    val previousIntervalInDays: Int
)