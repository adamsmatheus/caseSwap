package com.example.demo.controller

import com.example.demo.dto.CallerDto
import com.example.demo.service.RegisterRequestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/github")
class GitHubController {

    @Autowired
    lateinit var registerRequestService: RegisterRequestService

    @PostMapping("/newRequest")
    fun newRequest(@RequestBody callerDto: CallerDto): ResponseEntity<Any> {
        var register = registerRequestService.registerIssueEvent(callerDto)
        if (register == null) {
            return ResponseEntity(
                "Erro na tentativa da requisição, por favor tente novamente !",
                HttpStatus.NOT_FOUND
            )
        } else
            return ResponseEntity("Requisição executada com sucesso !", HttpStatus.OK)
    }

    @PostMapping("/hook")
    fun createWebhookRepository(@RequestBody callerDto: CallerDto): ResponseEntity<Any> {
        var register = registerRequestService.registerIssueEvent(callerDto)
        if (register == null) {
            return ResponseEntity(
                "Erro na tentativa da requisição, por favor tente novamente !",
                HttpStatus.NOT_FOUND
            )
        } else
            return ResponseEntity("Requisição executada com sucesso !", HttpStatus.OK)
    }



}