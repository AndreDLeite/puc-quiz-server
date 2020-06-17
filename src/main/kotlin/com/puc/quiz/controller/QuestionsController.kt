package com.puc.quiz.controller

import com.puc.quiz.model.QuestionItem
import com.puc.quiz.repository.QuestionItemRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("questions")
class QuestionsController(private val questionItemRepository: QuestionItemRepository) {

    @GetMapping
    fun getQuestionsList(): MutableIterable<QuestionItem> {
        return questionItemRepository.findAll()
    }
}