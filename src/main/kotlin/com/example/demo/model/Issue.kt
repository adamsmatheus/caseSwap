package com.example.demo.model

import java.sql.Timestamp
import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity

@Entity
class Issue(

    @javax.persistence.Id
    @Column(name = "id", nullable = false)
    open var id: Long? = null,
    val user: String = "",
    val title: String = "",
    val login: String = "",
    val body: String = "",

    )
