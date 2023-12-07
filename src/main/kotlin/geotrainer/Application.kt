package geotrainer

import geotrainer.plugins.configureDI
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import geotrainer.plugins.configureHTTP
import geotrainer.plugins.configureRouting
import geotrainer.plugins.configureSerialization

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureDI()
    configureSerialization()
    configureHTTP()
    configureRouting()
}
