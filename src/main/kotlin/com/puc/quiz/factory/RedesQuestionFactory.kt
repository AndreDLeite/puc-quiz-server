package com.puc.quiz.factory

import com.puc.quiz.model.QuestionItem
import com.puc.quiz.model.QuestionType

object RedesQuestionFactory: QuestionFactory() {
    override fun generateQuestions(): List<QuestionItem> {
        return listOf(
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.REDES
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.REDES
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.REDES
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.REDES
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.REDES
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.REDES
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.REDES
                )
        )
    }
}