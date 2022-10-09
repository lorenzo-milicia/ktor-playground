package org.lorenzo.modules.graphql

import io.ktor.server.application.*
import org.lorenzo.env.DatabaseFactory

fun Application.graphql() {

    DatabaseFactory.init()
}