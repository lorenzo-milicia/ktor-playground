package org.lorenzo.modules.greeting

import org.lorenzo.modules.greeting.domain.HelloService
import org.lorenzo.modules.greeting.domain.IHelloService

class GreetingDependencies {
	val helloService: IHelloService = HelloService()
}