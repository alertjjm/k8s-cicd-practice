package com.example.k8scicdpractice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/")
class WorkerController {
    @GetMapping("/work")
    fun work(): String {
        //working
        return "finished"
    }
}