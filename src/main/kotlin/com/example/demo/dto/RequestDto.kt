package com.example.demo.dto

data class RequestDto(

    var name: String,
    val config: ConfigRequest

)

data class ConfigRequest(
    val url: String,
    val content_type: String,
    val digest: String
)