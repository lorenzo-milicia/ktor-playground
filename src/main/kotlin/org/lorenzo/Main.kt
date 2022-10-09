package org.lorenzo

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.lorenzo.env.Context
import org.lorenzo.env.Env
import org.lorenzo.modules.graphql.graphql
import org.lorenzo.modules.greeting.greeting

fun main() {
    val env = Env()
    val context = Context(env)
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        app(context)
    }
}

fun Application.app(context: Context) {
    greeting(context)
    graphql()
}