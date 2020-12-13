package com.tanki.flashcards.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tanki.flashcards.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository): ViewModel() {
    val myResponse: MutableLiveData<Deck> = MutableLiveData()

    fun getDeck() {
        viewModelScope.launch {
            val response: Deck = repository.getDeck()
            myResponse.value = response
        }
    }
}