package com.puc.quiz.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity()
data class QuestionItem(var name: String = "",
                        var isAvailable: Boolean = false,
                        var question: String = "",
                        var options: List<String>,
                        var correctOption: Int,
                        var questionType: QuestionType = QuestionType.UNKNOWN,
                        @Id
                        @GeneratedValue(strategy = GenerationType.AUTO)
                        var id: Long = 0)
{
    fun isValid(): Boolean = options.size > 3
}

