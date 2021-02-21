package com.demo.wallpaperdemo.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.demo.wallpaperdemo.module.GithubAlldata
import com.demo.wallpaperdemo.network.WallpaperApiCall
import com.google.gson.Gson
import kotlinx.coroutines.launch


class GithubViewModel(application: Application) : AndroidViewModel(application) {

    val gitalldata: MutableLiveData<GithubAlldata> = MutableLiveData()


    fun getGitAllData() : MutableLiveData<GithubAlldata> {

        viewModelScope.launch {
            val response = WallpaperApiCall.getClient().apigitresponseAsync().await()
            if (response.code() == 200 && response.body() != null) {
                Log.e("test gson", Gson().toJson(response.body()))
                gitalldata.postValue(response.body())
            }

        }
        return gitalldata
    }


}