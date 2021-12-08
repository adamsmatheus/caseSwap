package com.example.demo.service

import com.example.demo.dto.CallerDto
import org.springframework.stereotype.Service
import kotlinx.coroutines.*

@Service
class GitHubService {

    fun RequestIssueAndContributor(callerDto: CallerDto) = runBlocking { // this: CoroutineScope
        launch { connectGitHub() }
        println("Feito")
        // A partir daqui fazer a conexão com o GiHub e dar o get nas issues
    }

    // this is your first suspending function
    suspend fun connectGitHub() {
        delay(1000L)
        println("World!")
    }


}