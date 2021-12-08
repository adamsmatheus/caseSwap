package com.example.demo.repository

import com.example.demo.model.Caller
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.sql.Timestamp
import java.util.*


@Repository

interface CallerRepository : CrudRepository <Caller,UUID> {

}