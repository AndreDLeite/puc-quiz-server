package com.puc.quiz.factory

import com.puc.quiz.model.QuestionItem
import com.puc.quiz.model.QuestionType

object HibridasQuestionFactory: QuestionFactory() {
    override fun generateQuestions(): List<QuestionItem> {
        return listOf(
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.HIBRIDAS
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.HIBRIDAS
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.HIBRIDAS
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.HIBRIDAS
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.HIBRIDAS
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.HIBRIDAS
                ),
                QuestionItem(
                        question = "",
                        options = listOf("", "", "", ""),
                        correctOption = 0,
                        questionType = QuestionType.HIBRIDAS
                )
        )
    }
}