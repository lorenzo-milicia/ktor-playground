package org.lorenzo.modules.greeting.domain

class HelloService: IHelloService {

	override suspend fun sayHello(language: Language): Greeting =
		when (language) {
			Language.ITALIAN -> Greeting("Ciao!")
		}
}