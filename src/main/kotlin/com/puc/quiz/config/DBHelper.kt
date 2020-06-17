package com.puc.quiz.config

import com.puc.quiz.model.QuestionItem
import com.puc.quiz.model.QuestionType
import com.puc.quiz.repository.QuestionItemRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import javax.persistence.PrePersist

@Component
class DBHelper(private val questionItemRepository: QuestionItemRepository) : CommandLineRunner {

    @PrePersist
    fun deleteAllBeforeSaving() {
        questionItemRepository.deleteAll()
    }

    override fun run(vararg args: String?) {
        val items = listOf(
                QuestionItem("questao1", true, "Qual sua idade?", QuestionType.AEDS),
                QuestionItem("questao2", true, "Qual seu nome?", QuestionType.HIBRIDAS),
                QuestionItem("questao3", true, "Qual sua altura?",QuestionType.DISTRIBUIDAS)
        )
        questionItemRepository.saveAll(items)
    }

}