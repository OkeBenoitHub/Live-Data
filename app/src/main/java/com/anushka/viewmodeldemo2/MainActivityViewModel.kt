package com.anushka.viewmodeldemo2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal : Int) : ViewModel() {
    private var _total = MutableLiveData<Int>()
    val total: LiveData<Int>
    get() = _total

    init {
        _total.value = startingTotal
    }

    fun setTotal(input:Int) {
        _total.value = _total.value?.plus(input)
    }
}