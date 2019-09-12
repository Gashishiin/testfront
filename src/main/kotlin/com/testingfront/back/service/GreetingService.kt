package com.testingfront.back.service

import com.testingfront.back.model.GreetingDto
import org.springframework.stereotype.Service
import java.time.Instant

@Service
class GreetingService {

    fun greeting(name: String) : GreetingDto = GreetingDto("Hello, ${name}", Instant.now())

}