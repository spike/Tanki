package com.tanki.flashcards.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tanki.flashcards.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {
    val myResponse: MutableLiveData<Response<Deck>> = MutableLiveData()
    val myResponse2: MutableLiveData<Response<Deck>> = MutableLiveData()
    val myResponse3: MutableLiveData<Response<List<Deck>>> = MutableLiveData()

    fun getDeck() {
        viewModelScope.launch {
            val response: Response<Deck> = repository.getDeck()
            myResponse.value = response
        }
    }

    fun getDeck2(number: Int) {
        viewModelScope.launch {
            val response: Response<Deck> = repository.getDeck2(number)
            myResponse2.value = response
        }
    }

    fun getDecks(number: Int) {
        viewModelScope.launch {
            val response: Response<List<Deck>> = repository.getDecks(number)
            myResponse3.value = response
        }
    }
}