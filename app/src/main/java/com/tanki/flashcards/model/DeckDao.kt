package com.tanki.flashcards.model

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface DeckDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addItem(deck: Deck)

    @Update
    fun updateItem(deck: Deck)

    @Delete
    suspend fun deleteItem(deck: Deck)

    @Query("DELETE FROM deck_table")
    suspend fun deleteAllItems()

    @Query( "SELECT * FROM deck_table ORDER BY deckId ASC")
    fun readAllData(): LiveData<List<Deck>>


}


