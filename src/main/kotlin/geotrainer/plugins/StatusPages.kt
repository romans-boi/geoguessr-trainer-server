package geotrainer.plugins

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.requestvalidation.RequestValidationException
import io.ktor.server.plugins.statuspages.StatusPages
import io.ktor.server.response.respondText

fun Application.configureStatusPages() {
    install(StatusPages) {
        exception<Throwable> { call, cause ->
            when (cause) {
                is RequestValidationException ->
                    call.respondText(status = HttpStatusCode.BadRequest, text = cause.reasons.joinToString())

                else ->
                    call.respondText(status = HttpStatusCode.InternalServerError, text = "500: $cause")
            }
        }
    }
}
