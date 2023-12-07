package geotrainer.feature.allquizzes.presentation

import geotrainer.feature.allquizzes.domain.AllQuizzesRepository
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import org.koin.ktor.ext.inject

fun Route.allQuizzesRouting() {
    route("/quizzes") {
        val allQuizzesRepository by inject<AllQuizzesRepository>()

        get {
            val allQuizzes = allQuizzesRepository.getAllQuizzes()

            call.respond(allQuizzes)
        }
    }
}
