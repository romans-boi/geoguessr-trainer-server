package geotrainer

import geotrainer.plugins.configureDI
import geotrainer.plugins.configureHTTP
import geotrainer.plugins.configureRouting
import geotrainer.plugins.configureSerialization
import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun Application.module() {
    configureDI()
    configureSerialization()
    configureHTTP()
    configureRouting()
}

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}
