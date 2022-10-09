package org.lorenzo.modules.greeting.routes

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.lorenzo.env.Context
import org.lorenzo.modules.greeting.domain.Language

fun Route.hello(dependencies: Context) {
	get("/hello") {
		val language = call.parameters["language"]
			?.let {
				runCatching { Language.valueOf(it.uppercase()) }.getOrNull()
			} ?: throw Exception("Language not supported")

		dependencies.helloService.sayHello(language).let {
			call.respondText { it.message }
		}
	}
}