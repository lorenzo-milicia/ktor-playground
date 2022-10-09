package org.lorenzo.env

import org.lorenzo.modules.greeting.domain.HelloService
import org.lorenzo.modules.greeting.domain.IHelloService

class Context(env: Env) {
    val helloService: IHelloService = HelloService()
}