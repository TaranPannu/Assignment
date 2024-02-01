package com.example.assign

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


//ViewModel
class ApiViewModel : ViewModel() {
    private val apiRepository = ApiRepository()

    // LiveData to observe changes in the data
    val apiDataList = MutableLiveData<MutableList<Api_Data>>()

    fun fetchData(context: Context, adapter: ApiAdapter) {
        apiRepository.fetchData(context) { apiDataList ->
            // Update LiveData with the new data
            this.apiDataList.value = apiDataList

            // Notify the adapter of the data change
         ///   adapter.update(apiDataList)
        }
    }
}
