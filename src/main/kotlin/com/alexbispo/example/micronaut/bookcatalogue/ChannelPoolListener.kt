package com.alexbispo.example.micronaut.bookcatalogue

import com.rabbitmq.client.BuiltinExchangeType
import com.rabbitmq.client.Channel
import io.micronaut.configuration.rabbitmq.connect.ChannelInitializer
import javax.inject.Singleton

@Singleton
class ChannelPoolListener : ChannelInitializer() {
    override fun initialize(channel: Channel?) {
        channel?.exchangeDeclare("micronaut", BuiltinExchangeType.DIRECT, true)

        channel?.queueDeclare("iventory", true, false, false, null)
        channel?.queueBind("iventory", "micronaut", "books.iventory")

        channel?.queueDeclare("catalogue", true, false, false, null)
        channel?.queueBind("catalogue", "micronaut", "books.catalogue")
    }

}