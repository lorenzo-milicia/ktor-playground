package org.lorenzo.modules.greeting

import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.lorenzo.modules.greeting.routes.hello

fun Application.greeting() {
	val dependencies = GreetingDependencies()
	routing {
		route("/greeting") {
			hello(dependencies)
		}
	}
}