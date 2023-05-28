package com.awesome.manager.core.network

import com.awesome.manager.core.network.ktor.LoginResponse

interface AuthNetworkDataSource {

    suspend fun login(email:String,password: String): LoginResponse

    suspend fun signUp(email: String,password:String): String

}