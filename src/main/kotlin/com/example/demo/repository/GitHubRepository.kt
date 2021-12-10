package com.example.demo.repository

import com.example.demo.model.Issue
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface GitHubRepository : CrudRepository<Issue, UUID> {
}