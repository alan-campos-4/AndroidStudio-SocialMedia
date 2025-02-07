package com.ejemplo.mobyhook

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ItemViewModel : ViewModel() {
    private val mutableItem = MutableLiveData<String>()
    val selectedItem: LiveData<String> get() = mutableItem
    fun getItem(): String? {
        return mutableItem.value
    }
    fun setItem(item: String) {
        mutableItem.value = item
    }
}