package org.lorenzo.modules.greeting

import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.lorenzo.env.Context
import org.lorenzo.modules.greeting.routes.hello

fun Application.greeting(context: Context) {
	routing {
		route("/greeting") {
			hello(context)
		}
	}
}