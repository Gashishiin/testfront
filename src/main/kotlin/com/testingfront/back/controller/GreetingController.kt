package com.testingfront.back.controller

import com.testingfront.back.model.GreetingDto
import com.testingfront.back.service.GreetingService
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@Api(value = "Greeting Controller")
@RequestMapping("/greeting")
class GreetingController(
        val greetingService: GreetingService
) {
    @GetMapping
    @ApiOperation(value = "Greeting")
    fun greeting(@RequestParam name: String): GreetingDto = greetingService.greeting(name)
}