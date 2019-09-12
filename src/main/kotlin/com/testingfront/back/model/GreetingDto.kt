package com.testingfront.back.model

import java.time.Instant

data class GreetingDto(
        val greeting: String,
        val date: Instant
) {

}