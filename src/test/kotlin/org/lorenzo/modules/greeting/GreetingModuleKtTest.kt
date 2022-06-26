package org.lorenzo.modules.greeting

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GreetingModuleKtTest {

	private val baseBath = "/greeting"

	@Test
	internal fun `GET hello endpoint`() =
		testApplication {
			val response = client.get("$baseBath/hello?language=italian")

			assertEquals(HttpStatusCode.OK, response.status)
			assertEquals("Ciao!", response.bodyAsText())
		}
}