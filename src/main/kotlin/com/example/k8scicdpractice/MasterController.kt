package com.example.k8scicdpractice

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping("api/")
class MasterController(
    @Value("\${worker.endpoint}")
    val workerUrl: String
) {
    @GetMapping("/execute")
    fun execute(): String? {
        val response =
            RestTemplate().getForObject(
                "$workerUrl/work",
                String::class.java
            )
        println(response)
        return response
    }
}