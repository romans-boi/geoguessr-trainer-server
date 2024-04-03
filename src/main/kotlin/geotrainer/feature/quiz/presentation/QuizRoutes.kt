package geotrainer.feature.quiz.presentation

import geotrainer.feature.quiz.domain.QuizRepository
import geotrainer.models.Continent
import geotrainer.models.quiz.QuizType
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.util.pipeline.*
import org.koin.ktor.ext.inject

fun Route.quizRouting() {
    val quizTypeParam = "quizType"
    val continentParam = "continent"
    val numOfQuestionsParam = "numOfQuestions"
    val numOfOptionsParam = "numOfOptions"

    route("/quiz") {
        val quizRepository by inject<QuizRepository>()

        get {
            val quizType = call.request.queryParameters[quizTypeParam]
                ?: return@get getMissingError(quizTypeParam)

            val continent = call.request.queryParameters[continentParam]

            val numOfQuestions = call.request.queryParameters[numOfQuestionsParam]
                ?: return@get getMissingError(numOfQuestionsParam)

            val numOfOptions = call.request.queryParameters[numOfOptionsParam]
                ?: return@get getMissingError(numOfOptionsParam)

            val quizQuestions = quizRepository.generateQuiz(
                quizType = QuizType.valueOfOrNull(quizType) ?: return@get getInvalidError(quizType),
                continent = Continent.valueOfOrNull(continent),

                numOfQuestions = numOfQuestions.toIntOrNull().let { num ->
                    if (num == null || num < 5 || num > 50) {
                        return@get getInvalidError("$numOfQuestionsParam - must be 5 <= x <= 50, and not null")
                    } else {
                        num
                    }
                },

                numOfOptions = numOfOptions.toIntOrNull().let { num ->
                    if (num == null || num < 2 || num > 4) {
                        return@get getInvalidError("$numOfOptionsParam - must be 2 <= x <= 4, and not null")
                    } else {
                        num
                    }
                }
            )

            call.respond(quizQuestions)
        }
    }
}

private suspend fun PipelineContext<Unit, ApplicationCall>.getMissingError(param: String) {
    call.respondText(
        text = "Missing $param",
        status = HttpStatusCode.BadRequest
    )
}

private suspend fun PipelineContext<Unit, ApplicationCall>.getInvalidError(param: String) {
    call.respondText(
        text = "Invalid $param",
        status = HttpStatusCode.BadRequest
    )
}
