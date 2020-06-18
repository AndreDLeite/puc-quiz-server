package com.puc.quiz.model

import javax.persistence.*

@Entity
data class QuestionItem(@Id
                        @GeneratedValue(strategy = GenerationType.AUTO)
                        var id: Long = 0,
                        var name: String = "",
                        var isAvailable: Boolean = false,
                        var question: String = "",
                        @ElementCollection
                        var options: List<String>,
                        var correctOption: Int,
                        var questionType: QuestionType = QuestionType.UNKNOWN) {
    fun isValid(): Boolean = options.size > 3
}

