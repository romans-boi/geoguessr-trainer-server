package geotrainer.plugins

import geotrainer.feature.allquizzes.presentation.allQuizzesRouting
import geotrainer.models.countries.Albania
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.routing
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

fun Application.configureRouting() {
    routing {
        get("/") {
            val json = Json { encodeDefaults = true }
            call.respondText(json.encodeToString(Albania()))
        }

        allQuizzesRouting()
    }
}
