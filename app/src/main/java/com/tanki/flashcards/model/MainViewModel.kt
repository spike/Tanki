package com.tanki.flashcards.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tanki.flashcards.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {
    val myResponse3: MutableLiveData<Response<List<Deck>>> = MutableLiveData()
   // val myResponse4: MutableLiveData<Response<List<Card>>> = MutableLiveData()

    fun getDecks(number: Int) {
        viewModelScope.launch {
            val response: Response<List<Deck>> = repository.getDecks(number)
            myResponse3.value = response
        }
    }
}