package com.alexbispo.example.micronaut.bookcatalogue

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.alexbispo.example.micronaut.bookcatalogue")
                .mainClass(Application.javaClass)
                .start()
    }
}