package org.lorenzo.modules.graphql

import io.ktor.server.application.*

fun Application.graphql() {

    DatabaseFactory.init()
}