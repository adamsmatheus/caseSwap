package com.example.demo.model

import java.sql.Timestamp
import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity

@Entity
data class Caller(

    @javax.persistence.Id
    @Column(name = "id", nullable = false)
    open var id: Long? = null,
    val user: String = "",
    val repository: String = "",
    val requestDate: Timestamp = Timestamp.from(
        Instant.now()

    )
)

