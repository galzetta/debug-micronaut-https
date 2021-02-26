package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.runtime.Micronaut.build

fun main(args: Array<String>) {
    build()
        .args(*args)
        .packages("com.example")
        .start()
}

@Controller
class Controller {
    @Get("/verify")
    fun verify(): String = "Working!"
}