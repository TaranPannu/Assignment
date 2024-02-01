package com.example.assign

import android.content.Context

class ApiRepository {
    private val apiCalling = ApiCalling()

    fun fetchData(context: Context, onComplete: (MutableList<Api_Data>) -> Unit) {
        apiCalling.fetchdata(context) { apiDataList ->
            onComplete(apiDataList)
        }
    }
}
