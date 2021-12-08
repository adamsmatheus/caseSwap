package com.example.demo.service

import com.example.demo.dto.CallerDto
import com.example.demo.repository.CallerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RegisterRequestService(private val callerRepository: CallerRepository) {

    @Autowired
    lateinit var gitHubService: GitHubService

    fun registerIssueEvent(callerDto: CallerDto) {
        val caller = callerDto.toModel()
        callerRepository.save(caller)

        gitHubService.RequestIssueAndContributor(callerDto)


    }

}
