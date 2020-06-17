package com.puc.quiz.config

import com.puc.quiz.model.QuestionItem
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
                QuestionItem("questao1", true),
                QuestionItem("questao2", true),
                QuestionItem("questao3", true),
                QuestionItem("questao4", true)
        )
        questionItemRepository.saveAll(items)
    }

}