package com.example.demo.service

import com.example.demo.dto.CallerDto
import com.example.demo.dto.GitHubDto
import kotlinx.coroutines.*
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class GitHubService {

    fun RequestIssueAndContributor(callerDto: CallerDto) = runBlocking { // this: CoroutineScope
        launch { connectGitHub(makeConnection(callerDto)) }
        println("Feito")
    }

    private fun makeConnection(callerDto: CallerDto): String {
        val url = "https://api.github.com/repos/" +
                callerDto.user + "/" + callerDto.repository + "/issues"
        return url
    }

    suspend fun connectGitHub(url: String) {
        lateinit var restTemplate: RestTemplate
        println(url)
            restTemplate.getForEntity(url, GitHubDto::class.java)
        //println(gitHubjson)

        //val json = getJson() // your json value here
        //val topic = Gson().fromJson(json, Json4Kotlin_Base::class.java)
    }


}