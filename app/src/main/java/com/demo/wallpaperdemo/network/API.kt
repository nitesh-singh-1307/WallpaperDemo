package com.demo.wallpaperdemo.network

import com.demo.wallpaperdemo.module.GithubAlldata
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
interface API {

    /* user login*/
    @GET("gists/public")
    fun apigitresponseAsync(): Deferred<Response<GithubAlldata>>

}