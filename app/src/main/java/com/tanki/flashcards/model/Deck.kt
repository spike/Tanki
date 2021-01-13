package com.tanki.flashcards.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Parcelize
@Entity(tableName = "deck_table")
data class Deck(
        @PrimaryKey(autoGenerate = true)
        val deckId: Int,
        val topic: String?,
        val userId: Int,
    // val color: String,
    // val priority: Int,
    // val numberOfCardsDue: Int,
    // val archived: Boolean,
    // val suspended: ?
        // val deleted: Boolean,
        // val deletedOn: Date,
    // val whiteboardEnabled: Boolean,
       // val lastEdited: Date,
        val size: Int,
    // val hash: Int, // (for testing uniqueness of the deck)
        val due: Int
    // will need to change due to an actual date
) : Parcelable

