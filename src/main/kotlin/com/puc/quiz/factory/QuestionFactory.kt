package com.puc.quiz.factory

import com.puc.quiz.model.QuestionItem

abstract class QuestionFactory {
    abstract fun generateQuestions(): List<QuestionItem>
}