package org.lorenzo.modules.greeting.domain

interface IHelloService {
	suspend fun sayHello(language: Language): Greeting
}

