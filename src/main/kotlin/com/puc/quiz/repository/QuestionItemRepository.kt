package com.puc.quiz.repository

import com.puc.quiz.model.QuestionItem
import com.puc.quiz.model.QuestionType
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface QuestionItemRepository : CrudRepository<QuestionItem, Long> {

    @Query("select g from QuestionItem g where g.isAvailable = ?1")
    fun findItemsByAvailability(availability: Boolean): List<QuestionItem>

}