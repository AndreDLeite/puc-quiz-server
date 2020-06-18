package com.puc.quiz.config

import com.puc.quiz.factory.DistribuidasQuestionFactory
import com.puc.quiz.factory.HibridasQuestionFactory
import com.puc.quiz.factory.RedesQuestionFactory
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
        val items =
                HibridasQuestionFactory.generateQuestions() +
                        RedesQuestionFactory.generateQuestions() +
                        DistribuidasQuestionFactory.generateQuestions()

        questionItemRepository.saveAll(items)
    }

}