package com.alexbispo.example.micronaut.bookcatalogue

import io.micronaut.configuration.rabbitmq.annotation.Queue
import io.micronaut.configuration.rabbitmq.annotation.RabbitListener

@RabbitListener
class BookCatalogueService {

    @Queue("catalogue")
    fun listBooks(): List<Book> {
        return listOf(Book("1491950358", "Building Microservices"),
                        Book("1680502395","Release It!"),
                        Book("0321601912", "Continuous Delivery:"))
    }

}