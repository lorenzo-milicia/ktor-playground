package org.lorenzo.modules.greeting.domain

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HelloServiceTest {

	private val service: IHelloService = HelloService()

	@Test
	internal fun `Say hello works as expected`() {
		val language: Language = Language.ITALIAN
		val expectedMessage = Greeting(message = "Ciao!")

		val result = runBlocking { service.sayHello(language) }

		assertEquals(expectedMessage, result)
	}
}