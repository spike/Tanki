package com.tanki.flashcards.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tanki.flashcards.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {
    val myResponse: MutableLiveData<Response<Deck>> = MutableLiveData()

    fun getDeck() {
        viewModelScope.launch {
            val response: Response<Deck> = repository.getDeck()
            myResponse.value = response
        }
    }
}