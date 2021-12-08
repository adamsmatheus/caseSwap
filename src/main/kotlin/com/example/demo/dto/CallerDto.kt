package com.example.demo.dto

import com.example.demo.model.Caller
import java.sql.Timestamp
import java.time.Instant

data class CallerDto(
    val id : Long,
    val user: String,
    val repository: String
) {

    fun toModel(): Caller {
        return Caller(id,user, repository, Timestamp.from(Instant.now()))
    }


}