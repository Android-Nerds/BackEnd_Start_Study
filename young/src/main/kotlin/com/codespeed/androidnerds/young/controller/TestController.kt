package com.codespeed.androidnerds.young.controller

import com.codespeed.androidnerds.young.service.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @GetMapping("/")
    fun test(): String {
        return "Hello, World!"
    }

    @GetMapping("/hello/{name}")
    fun test2(@PathVariable name: String): String {
        return "Hello $name"
    }

    @Autowired
    lateinit var testService: TestService

    @GetMapping("/service")
    fun testService(): String {
        return testService.testService()
    } // End of testService


    // PathVariable은 /로 나누는 것
    // API만들 때는 PathVariable을 권장 
    // RequestParam은 구식 -> ?로 시작을 하고 다른 변수를 연결할 때는 &기호로 연결함
} // End of TestController class