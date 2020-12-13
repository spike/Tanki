package com.tanki.flashcards.model

import java.util.*

data class Card(
    val id: Int,
    val deckId: Int,
    val front: String,
    val back: String,
    val nextDue: Date
)