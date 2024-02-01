package com.example.assign

import android.content.Context
import android.util.Log
import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONObject
import java.nio.charset.Charset


class ApiCalling {
    val apiDataList = mutableListOf<Api_Data>()


    fun fetchdata(context: Context, onComplete: (MutableList<Api_Data>) -> Unit) {
        val url = "https://api.inopenapp.com/api/v1/dashboardNew"
        val token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6MjU5MjcsImlhdCI6MTY3NDU1MDQ1MH0.dCkW0ox8tbjJA2GgUx2UEwNlbTZ7Rr38PVFJevYcXFI"// Read this from local storage

        val request: JsonObjectRequest = object : JsonObjectRequest(
            Method.GET, url, null,
            Response.Listener { response ->
                // Extracting data array
                val dataArray = response.getJSONObject("data")
                val recentLinksArray = dataArray.getJSONArray("recent_links")
                val todayClicks = response.optInt("today_clicks")
                val topLocation = response.optString("top_location")
                val topSource = response.optString("top_source")

                // Iterate through the recent_links array
                for (i in 0 until recentLinksArray.length()) {
                    val recentLink = recentLinksArray.getJSONObject(i)

                    // Extract values for Api_Data object
                    val imageUrl = recentLink.optString("original_image", "")
                    val linkName = recentLink.optString("title", "")
                    val date = recentLink.optString("times_ago", "")
                    val clicks = recentLink.optInt("total_clicks", 0)
                    val numberOfClicks = 0 // Replace with the actual value you want
                    val link = recentLink.optString("web_link", "")

                    // Create Api_Data object
                    val apiData = Api_Data(imageUrl, linkName, date, clicks, numberOfClicks, link,todayClicks,topLocation,topSource)

                    // Add Api_Data object to the list
                    apiDataList.add(apiData)
                }
                onComplete(apiDataList)


                Log.i("TxG", "Response: $response")
            },
            Response.ErrorListener { error ->
                if (error is AuthFailureError && error.networkResponse != null) {
                    val errorResponse = String(error.networkResponse.data, Charset.defaultCharset())
                    Log.e("TxG", "AuthFailureError: $errorResponse")
                } else {
                    Log.e("TxG", "Error: $error", error)
                }
            }
        ) {
            @Throws(AuthFailureError::class)
            override fun getHeaders(): Map<String, String> {
                val headers: MutableMap<String, String> = HashMap()
                headers["Authorization"] = "Bearer $token"
                return headers
            }
        }

        MySingleton.getInstance(context).addToRequestQueue(request)
    }

}