package com.example.demo.service

import com.example.demo.dto.CallerDto
import com.example.demo.dto.ConfigRequest
import com.example.demo.dto.RequestDto
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Component
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse


@Component
class GitHubService {

    fun RequestIssueAndContributor(callerDto: CallerDto) = runBlocking { // this: CoroutineScope
        launch { connectGitHub(makeConnection(callerDto)) }

        println()
    }

    private fun makeConnection(callerDto: CallerDto): String {
        val url = "https://api.github.com/repos/" +
                callerDto.user + "/" + callerDto.repository + "/hooks"
        return url
    }

    suspend fun connectGitHub(url: String) {

        val configRequest = ConfigRequest("http://example.com/webhook", "json", "1")
        val requestDto = RequestDto(
            "web", configRequest
        )
        val body = Gson().toJson(requestDto)

        val client = HttpClient.newBuilder().build();
        val request = HttpRequest.newBuilder().header("Accept", "application/vnd.github.v3+json")
            .header("Authorization", "token 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")
            .uri(URI.create(url))
            .POST(HttpRequest.BodyPublishers.ofString(body))
            .build()
        val response = client.send(request, HttpResponse.BodyHandlers.ofString());
        println(response.body())


        //val body = Gson().toJson(requestDto)  // json string


        /* val request = Request.Builder().url(url).header("Accept", "application/vnd.github.v3+json")
             .header("Authorization", "token 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").post(body).build()*/

        /*client.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) {
                val body = response?.body()?.string()


                val gson = GsonBuilder().create()
                val gitHubDto = gson.fromJson(body, GitHubDto::class.java)
                println(gitHubDto)
                // gitHubDtoListToIssue(gitHubDtoList)

            }*/

        /*override fun onFailure(call: Call, e: IOException) {
            println("Falhou!")
        }


    })*/


    }

    /* private fun gitHubDtoListToIssue(gitHubDtoList: List<GitHubDto>) {
         val issue = Issue()
         for (gitHubIssues in gitHubDtoList)
            // gitHubIssues.title

     }*/

}