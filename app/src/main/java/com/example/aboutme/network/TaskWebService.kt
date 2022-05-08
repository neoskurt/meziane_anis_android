package com.example.meziane_anis.network

import com.example.meziane_anis.tasklist.Task
import retrofit2.Response
import retrofit2.http.GET

interface TaskWebService {
    @GET("tasks")
    suspend fun getTasks(): Response<List<Task>>
}