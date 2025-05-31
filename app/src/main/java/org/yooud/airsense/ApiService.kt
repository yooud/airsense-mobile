package org.yooud.airsense

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("auth")
    suspend fun register(@Body req: RegisterRequest): Response<Void>
}
